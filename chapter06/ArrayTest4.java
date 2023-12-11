package chapter06;

public class ArrayTest4 {
	public static void main(String[] args) {
		//2차원 배열 인스턴스 생성
		int [][]arr = new int[2][2];
		
		//배열 요소에 값 대입
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[1][0] = 21;
		arr[1][1] = 22;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);	
		System.out.println(arr[1][0]);	
		System.out.println(arr[1][1]);	
		
	
	}
	
	
}
