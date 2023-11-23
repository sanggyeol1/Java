package 클래스와인스턴스;



//객체지향 : 현실세계에 있는 사물이나 사건을 가져 옴
//클래스는 설계도라고 비유함, 인스턴스(객체)는 설계도를 가지고 만든 제품, 붕어빵 틀과 붕어빵에 비유 가능


public class DeskLamp {

	private boolean isOn;
	
	public void turnOn() {  isOn = true;  }
	public void turnOff() {  isOn = false;  }
	public String toString() {
		return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
	}
	
	
}
