package 데이터출력;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int value : numbers)
			System.out.print(value+" ");

	//배열 == 같은 타입의 데이터를 한번에 모아놓은 것임. 
	//데이터10000개를 다 선언, 할당하려면 너무 오래 걸리기에 배열로 묶는것임
	//배열은 인덱스로 접근함. 데이터들에 다 번호가 붙어 있음 0부터 시작
	}
}
