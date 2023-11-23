package 데이터출력;
import java.util.*;

public class RockPaperSissor {
	final int SCISSOR = 0;
	final int Rock = 1;
	final int PAPER = 2;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) : ");
		int user = sc.nextInt();
		
		int computer = (int)(Math.random()*3);
		if( user == computer ) {
			System.out.println("인간과 컴퓨터가 비겼습니다.");
		}else if(user == (computer+1)%3) {
			System.out.println("인간이 이겼습니다.");
		}else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
	}
}
