package chapter13;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("새로운 쓰레드가 실행됩니다.");
	}
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();

		t.start();//오휴 발생, 스레드 인스턴스를 두 번 start()할 경우
		//IllegalThreadStateException이 발생한다.
		//스레드 인스턴스는 하나의 실행 흐름이 생성되면 같은 스레드 인스턴스의 실행 흐름을 만들지 않음
	}
}
