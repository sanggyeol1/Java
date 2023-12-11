package chapter06;
public class ArrayTest8 {

	public static void main(String[] args) {
		
		int[][] scores = {//배열 인스턴스 생성과 초기화
				{100, 90, 80}, {98, 76, 90}
		};
		
		for( int[] is : scores) {//행의반복
			for(int i : is) {//열의 반복
				System.out.print(i + ", \t");//변수 i에 각 요소
			}
			System.out.println();
		}

	}

}
