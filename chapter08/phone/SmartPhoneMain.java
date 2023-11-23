package chapter08.phone;


class SmartPhone implements Phone{
	
	boolean power;
	
	//call()메소드 오버라이딩
	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);
		System.out.println(number1+number2+number3+"에 전화합니다.");
	}
	
	//turnOn() 메소드 오버라이딩
	@Override
	public void turnOn() {
		if(!power) {
			power = true;
		}
	}
	
	//turnOff() 메소드 오버라이딩
	@Override
	public void turnOff() {
		if(power) {
			power = false;
		}
	}
	
}


public class SmartPhoneMain {

	public static void main(String[] args) {
		
		
			SmartPhone phone = new SmartPhone();
			phone.call();
		
		
	}

}
