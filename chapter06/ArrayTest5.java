package chapter06;
public class ArrayTest5 {

	public static void main(String[] args) {
		
		
		//배열 인스턴스 생성과 초기화
		int[][] scores = {
				{100, 90, 80}, {98, 76, 90}, {85, 84, 77}, {89, 100, 69}
		};
		
		//2차원 배열의 참조
		System.out.println("scores[0][0] => " + scores[0][0]); // 100
		System.out.println("scores[1][1] => " + scores[1][1]); // 76
		System.out.println("scores[2][2] => " + scores[2][2]); // 77
		System.out.println("scores[3][2] => " + scores[3][2]); // 69

	}

}
