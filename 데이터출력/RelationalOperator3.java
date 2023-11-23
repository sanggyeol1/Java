package 데이터출력;

public class RelationalOperator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		int num = 10;
		
		System.out.println( c > 10); // 아스키코드로 'A'는 65임
		System.out.println( '1' > '0' ); // 문자를 숫자로 자동변환하여 출력
		System.out.println( num == 10f ); //10이나 10.0이나 같음
	
		//int는 float으로 자동 형변환이 되지만 반대는 적용이 안됨(데이터의 손실 때문임)
		//데이터의 손실 여부가 자동 형변환 여부를 결정함
		
	}

}
