package chapter07;

public class ClassTypeChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-9999-9999");
		
		Phone phone1 = androidPhone;
		Phone phone2 = iPhone;
		
		IPhone iPhone1 = (IPhone)phone2;
		IPhone iPhone2 = (IPhone)phone1;
	
	}

}
