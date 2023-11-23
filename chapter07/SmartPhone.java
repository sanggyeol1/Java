package chapter07;

public class SmartPhone extends Phone {
String model;
	
	public SmartPhone() {

	}
	
	public SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	void game() {
		System.out.println(model+" 게임을 합니다.");
	}
	
	
	
}
