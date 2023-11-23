package 데이터출력;

import java.util.Scanner;

public class PP5 {
	public static void main(String[] args) {
		System.out.print("이름을 입력하세요 >> ");
		Scanner in = new Scanner(System.in);//스캐너와 프린트의 순서가 바뀌어도 상관이 없다.
		
		String name = in.nextLine(); //사용자가 입력한 값은 String데이터값으로 변환해서 저장
		System.out.print("안녕하세요. "+name+"님. 반갑습니다.");
		in.close();
	}
}
