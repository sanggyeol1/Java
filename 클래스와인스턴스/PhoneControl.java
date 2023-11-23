package 클래스와인스턴스;

public class PhoneControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp1 = new SmartPhone(); // SmartPhone 클래스로 객체 생성
		SmartPhone sp2 = new SmartPhone(); // SmartPhone 클래스로 객체 생성
		
		
		sp1.color = "Gold"; // 첫 번째 객체의 변수 color 속성값 대입
		sp1.size = 5.7F; // 첫 번째 객체의 변수 size 속성값 대입
		sp1.volume = 5; // 첫 번째 객체의 변수 volume 속성값 대입
		System.out.println("> color : " + sp1.color); // 첫 번째 객체의 변수들을 출력
		System.out.println("> size : " + sp1.size); //
		System.out.println("> volume : " + sp1.volume); //


	}
	
	
	
}
