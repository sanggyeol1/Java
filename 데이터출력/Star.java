package 데이터출력;

import java.util.*;

public class Star {

	public static void main(String[] args) {
		int[][] seats ={
				{0,1,0,0,0,1,0},
				{0,0,0,1,0,1,0},
				{1,0,0,0,1,1,0},
				{1,1,0,1,1,1,0},
		};
		
		int total = 0;
		
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				total += seats[i][j];
			}
		}
		System.out.println("현재 관객 수는 "+ total + "명 입니다.");
	}
}