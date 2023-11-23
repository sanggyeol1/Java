package chapter07;

public class SmartPhoneImpl2 extends Phone {
	
	String model;
	
	public SmartPhoneImpl2(String phoneNumber, String model) {
		super(phoneNumber); // 상위클래스 생성자 호출
		this.model = model;
	}

	@Override
	void call() { // 오버라이딩
		super.call(); // super 키워드는 상위클래스를 가르키는 키워드
		System.out.println("이어팟을 이용해서 통화를 합니다.");
	}
	
	void playMusic() { // 새로운 메소드를 정의
		System.out.println("다이너마이트가 플레이됩니다.");
	}
}