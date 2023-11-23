package CodeIn;

import java.util.*;




public class SmartPhone {
	
	String name = "IPhone 13 Mini";
	int price = 700000;
	int PhoneNumber = 010-2234-1730;
	String color = "White";
	int volume = 0;
	
	void volumeUp(){
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
	
	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone();
		System.out.println(sp1.volume);
		
	}
}
