package 데이터출력;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.");
			
		}else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
	}

}
