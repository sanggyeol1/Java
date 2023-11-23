package CodeIn;

import java.util.*;


public class Grade {
	static String grade;
	static Scanner sc = new Scanner(System.in);
	
	static void GradeGive() {
		System.out.println("점수를 입력하시오");
		int score = sc.nextInt();
		
		switch(score / 10) {
		case 10 : grade = "A";	break;
		case 9 : grade = "A";	break;
		case 8 : grade = "B";	break;
		case 7 : grade = "C";	break;
		case 6 : grade = "D";	break;
		
		
		default : grade = "F";	break;
		}
	}
	
	
	public static void main(String[] args) {
		
		GradeGive();
		
		
		System.out.println(
				
				
				grade);
		
		
	}

}
