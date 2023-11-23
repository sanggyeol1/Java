package 클래스와인스턴스;

public class BoxClass {
	
	
	int boxRow = 20;
	int boxCol = 20;
	int boxHigh = 30;
	int boxVolume = boxRow * boxCol * boxHigh;
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxClass bx1 = new BoxClass();
		System.out.println("박스의 부피는" + bx1.boxVolume);

	}

}
