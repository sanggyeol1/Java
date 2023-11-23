package chapter07;

public class ClassTypeChange {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		
		Phone phone1 = (Phone)androidPhone;
		phone1.call();
		
		Phone phone2 = androidPhone;
		phone2.call();

	}

}
