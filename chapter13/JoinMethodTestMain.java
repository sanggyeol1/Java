package chapter13;

public class JoinMethodTestMain {

	public static void main(String[] args) {
		
		JoinTestThread thread1 = new JoinTestThread("A");
		JoinTestThread thread2 = new JoinTestThread("B");
		JoinTestThread thread3 = new JoinTestThread("C");

		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

class JoinTestThread extends Thread{
	public JoinTestThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(getName()+"쓰레드 실행");
		}
	}
	
}


