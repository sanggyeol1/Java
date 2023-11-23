package chapter08.phone;


class Computer{
	void calculator() {
		System.out.println("컴퓨팅이 가능합니다.");
	}
}

//클래스의 상속과 인터페이스의 구현을 함께 하는 것은 다중상속의 효과
class SmartPhoneImpl extends Computer implements Phone{
	
	boolean power;
	
	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);
		System.out.println(number1+number2+number3+"에 전화합니다.");
	}
	
	@Override
	public void turnOn() {
		if(!power) {
			power = true;
		}
	}
	
	@Override
	public void turnOff() {
		if(power) {
			power = false;
		}
	}
	
}



public class SmartPhoneMain2 {

	public static void main(String[] args) {
		
		SmartPhoneImpl phone = new SmartPhoneImpl();
		
		phone.call();
		phone.calculator();
	}

}
