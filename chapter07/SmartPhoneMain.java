package chapter07;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		Phone phone = new SmartPhoneImpl2("010-1111-2222", "Android");
		
		phone.call();

	}

}
