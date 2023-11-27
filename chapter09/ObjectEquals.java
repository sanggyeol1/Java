package chapter09;

public class ObjectEquals {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		
		//Object 클래스에 정의되어 있는 equals()메소드는 참조 값 비교 결과를 반환
		
		System.out.println("두 객체를 equals() 비교 : " + c1.equals(c2));
		
		//새로운 객체가 생성된다면 이전의 객체와는 같다고 할 수 없음
		//두 참조변수의 참조 값을 동일하게 변경
		
		c1 = c2;
		
		System.out.println("두 참조변수의 참조값을 동일하게 변경");
		System.out.println("두 객체를 equals()비교 : " + c1.equals(c2));

	}

}
