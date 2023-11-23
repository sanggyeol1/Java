package CodeIn;

public class CodeIn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string은 타입이 아니라 클래스이다. 기본 자료형을 제외하고는 모두 클래스라고 보면 된다.
		//final int a = 4 이런식으로 하면 상수로 적용이 된다.
		//단항연산자 ++, -- 
		//프로그램이 줄단위로 적용됨 x++면 그 줄이 끝나고 증가, ++x면 x가 먼저 증가되고 출력함 
		
		boolean a = true;
			if( a ) {
				System.out.println("데이터출력"); //이렇게만 써도 if true 적용 
			}
			
			
			
		int arr[] = new int[5];
		
		arr[0] = 1;
		
		
		//메소드에 대한 설명 : 함수와 비슷함.
		// input값 : 파라미터
		// return값 : 출력값
		
		int f(int x) {
			return x+3;
		}
		
		void f(int x) {
			x+3;
		}//보이드를 쓰면 return을 안써도 된다.
		//추가로 파라미터가 없을때도 void로 선언하는게 좋음
		
	}

}
