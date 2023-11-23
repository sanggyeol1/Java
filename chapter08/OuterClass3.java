package chapter08;

public class OuterClass3 {

	private String name;
	
	OuterClass3(String name){
		this.name = name;
	}
	
	public BasicClass createLocalClassInstance() {
		return new BasicClass() {
			@Override
			public void tell() {
				System.out.println("안녕하세요. " + name + "입니다.");
			}
		};
	}
	
	public static void main(String[] args) {
		OuterClass3 out = new OuterClass3("SCOTT");
		BasicClass localInst1 = out.createLocalClassInstance();
		localInst1.tell();
	}
	
	
	
}
