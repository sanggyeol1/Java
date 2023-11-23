package 배열;

public class Arraytest1 {

	public static void main(String[] args) {
		
		int[] korScores = new int[10];
		
		korScores[0] = 68;
		korScores[1] = 65;
		korScores[2] = 86;
		korScores[3] = 91;
		korScores[4] = 65;
		korScores[5] = 78;
		korScores[6] = 61;
		korScores[7] = 64;
		korScores[8] = 88;
		korScores[9] = 98;
		
		int sum = 0;
		float avg = 0f;
		
		for (int i = 0; i < korScores.length; i++) {
			sum+=korScores[i];
		}
		avg = sum / korScores.length;
		
		System.out.println("국어점수의 총합은" + sum + "입니다.");
		System.out.println("국어점수의 평균은" + avg + "입니다.");

	}

}
