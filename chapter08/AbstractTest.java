package chapter08;

abstract class Shape{//추상클래스 Shape를 선언한다. 추상클래스로는 객체를 생성할 수 없다.
	int x, y;
	public void translate(int x, int y) {//추상클래스라고 하더라도 추상 메소드가 아닌 보통의 메소드도 가질 수 있다.
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
	//추상 메소드를 선언한다. 추상 메소드를 하나라도 가지면 추상클래스가 된다. 
	//추상 메소드를 가지고 있는데도 abstract를 class 앞에 붙이지 않으면 컴파일 오류가 발생한다.
};

class Rectangle extends Shape{
	int width, height;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}//자식 클래스 Rectangle에서 부모 클래스의 추상 메소드 draw();가 실제
	//메소드로 구현된다. 자식 클래스에서 추상 메소드를 구현하지 않으면 컴파일 오류가 발생
}


class Circle extends Shape{
	int radius;
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
}

public class AbstractTest {

	public static void main(String args[]) {
		//Shape s1 = new Shape(); -> 이 코드는 추상 클래스로 객체를 생성했기 때문에 오류가 난다.
		Shape s2 = new Circle();
		s2.draw();
	}

}
