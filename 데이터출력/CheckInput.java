package 데이터출력;
import java.util.*;

public class CheckInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		do {
				System.out.println("올바른 월을 입력하세요[1-12] : ");
				month = sc.nextInt();
		}while(month < 1 || month >12);
		
		System.out.println("사용자가 입력한 월은 " + month);
		
	}

}
