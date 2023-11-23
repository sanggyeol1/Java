package CodeIn;

import java.util.Scanner;

public class CardGame {
	
	Scanner sc = new Scanner(System.in);
	int total = 0;
	
	

	
	void input() {
		for(int i = 0; i < 5; i++) {
			System.out.println("점수를 입력하세요");
			int score = sc.nextInt();
			total+=score;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardGame g1 = new CardGame();
		
		g1.input();
		
		System.out.println(g1.total);
		
	}
	
	
}
