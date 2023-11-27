package chapter09;

public class SystemNanoTime {

	public static void main(String[] args) {
		
		//작업시작시간을 변수에 저장
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
			int n1 = 1;
			int n2 = 10;
			int sum = n1+n2;
		}
		//작업 종료 시간을 변수에 저장
		long endTime = System.nanoTime();
		
		//실행시간은 종료 시간에서 시작시간을 빼준다.
		long estimatedTime = endTime = startTime;
		System.out.println("해당 기능의 실행 시간 : " + estimatedTime);

	}

}
