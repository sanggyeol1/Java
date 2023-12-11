package chapter06;
public class ArrayTest6 {

	public static void main(String[] args) {
		
		int[][] scores = {
				{100, 90, 80},
				{98, 76, 90},
				{85, 84, 77},
				{89, 100, 69}
		};
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]);
			}
			System.out.println();
		}

	}

}
