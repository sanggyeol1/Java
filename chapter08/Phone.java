package chapter08;

//추상 메소드와 메소드 오버라이딩
//추상 클래스는 상속을 목적으로 하는 클래스이기 때문에 추상 클래스를 상위 클래스로
//사용해서 새로운 클래스를 정의할 수 있음

public abstract class Phone {

	String phoneNumber;
	
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	void call() {
		System.out.println(phoneNumber + "에서 전화를 걸어 통화합니다.");
	}
		abstract void turnOn(); // 스마트폰 모델에 따라 전원을 키는 기능이 다르게 정의
}
