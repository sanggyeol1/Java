package 데이터출력;
import java.util.*;

public class Averager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while(true) {
			System.out.println("점수를 입력하시오 : ");
			int score = sc.nextInt();
				
			if(score < 0) 	break;
			
			total += score;
			count++;
			
		}
		
		int average = total / count;
		System.out.println("평균은" + average + "입니다." );
		
	}

}
