package 데이터출력;

public class IncOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y = 1;
		
		int a = x++; //a를 사용한 후에 증가함
		int b = ++y; //b를 사용하기 전에 증가
		System.out.println("a = " + a + ",  b = " + b); 
		
		int c = 100, d = 200;
		c += 10;
		d /= 10;
		System.out.println("c = " + c + ", d = " + d);
	}

}
