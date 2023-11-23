package 배열;

public class Arraytest2 {
	
	public static void main(String[] args) {
		
		int[] score1 = { 100, 90, 70, 80, 65 };
		int[] score2 = new int[] { 100, 90, 70, 80, 65 };
		int[] score3;
		score3 = new int[] { 100, 90, 70, 80, 65 };
		
		System.out.println("배열 score1 =====");
		for( int i = 0; i < score1.length; i++) {
			System.out.print(score1[i] + ", ");
		}
		
		System.out.println("");
		
		System.out.println("배열 score2 =====");
		for( int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + ", ");
		}
		
		System.out.println("");
		
		System.out.println("배열 score3 =====");
		for( int i = 0; i < score1.length; i++) {
			System.out.print(score3[i] + ", ");
		}
		
	}
}
