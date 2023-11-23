package 데이터출력;
import java.util.*;


public class Welcomeloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int count = 0;
		
		while(true) {
			System.out.println("정수를 입력하시오 : ");
			int input = sc.nextInt();
			if(input == -1)		break;
			
			total += input;
			count ++;
			
		}
		System.out.println("정수의 합은" + total + "입니다.");
	}
}
