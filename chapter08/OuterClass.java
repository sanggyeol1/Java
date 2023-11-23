package chapter08;

public class OuterClass {

	private String name;
	private int num;
	
	OuterClass(String name){
		this.name = name;
		num = 0;
	}
	
	public void tellYourName() {
		num++;
		System.out.println(name + "OuterClass" + num);
	}
	
	class InnerClass{
		InnerClass(){
			tellYourName();//외부 클래스의 메소드 호출
		}
	}
	
	public static void main (String[] args) {
		OuterClass out1 = new OuterClass("KING");
		OuterClass out2 = new OuterClass("SCOTT");
		out1.tellYourName();
		out2.tellYourName();
		
		OuterClass.InnerClass inn1 = out1.new InnerClass();
		OuterClass.InnerClass inn2 = out2.new InnerClass();
		OuterClass.InnerClass inn3 = out1.new InnerClass();
		OuterClass.InnerClass inn4 = out1.new InnerClass();
		OuterClass.InnerClass inn5 = out2.new InnerClass();
	
	}
	
	
	
	
}
