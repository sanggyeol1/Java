package 데이터출력;
import java.util.*;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("Grade is A");
			
		}else if(score >= 80){
			System.out.println("Grade is B");
		}else if(score >= 70){
			System.out.println("Grade is C");
		}else if(score >= 60){
			System.out.println("Grade is D");
		}else {
			System.out.println("Grade is F");
		}
	}

}
