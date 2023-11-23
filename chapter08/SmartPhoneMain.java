package chapter08;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		//Phone phone = new Phone(); //인스턴스 생성 불가
		
		//SmartPhone smartPhone = new SmartPhone("010-0000-0000", "IOS");
		Phone smartPhone = new SmartPhone("010-0000-0000","IOS");
		smartPhone.turnOn();
	}

}
