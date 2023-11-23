package chapter08;

public class OuterClass2 {

	
	private String name;
	
	OuterClass2(String name){
		this.name = name;
	}
	
	
	//BasicClass 클래스를 상속하는 구조로 해서 반환 타입을 BasicClass타입으로 처리
	public BasicClass createLocalClassInstance(final int age) {
		class LocalClass extends BasicClass{
			@Override
			public void tell() {
				System.out.println("안녕하세요" + age + "살" + name + "입니다.");
			}
		}
		return new LocalClass();
	}
	
	
	public static void main(String[] args) {
		OuterClass2 out = new OuterClass2("KING");
		BasicClass localnst1 = out.createLocalClassInstance(12);
		localnst1.tell();
	}
	
	
	
}

abstract class BasicClass{
	public abstract void tell();
}
