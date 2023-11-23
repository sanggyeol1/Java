package 데이터출력;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		
		int[][]rarray = new int[3][];
		
		rarray[0] = new int[] {1,2,3,4};
		rarray[1] = new int[] {5,6,7};
		rarray[2] = new int[] {8,9};
		
		for (int[] row:rarray) {
			System.out.println(Arrays.toString(row));
		}
		
	}

}
