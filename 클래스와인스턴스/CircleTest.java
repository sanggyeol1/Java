package 클래스와인스턴스;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		obj.radius = 100;
		obj.color = "Blue";
		double area = obj.getArea();
		System.out.println(area);
	}

}
