package chapter13;

public class SleepTest {

	public static void main(String[] args) throws InterruptedException {
		String messages[] = {
				"Pride will have a fall",
				"Power is dangerous unless you have humanity",
				"Office chages manners",
				"Empty vessels make the most sound"
		};
		
		for (int i = 0; i < messages.length; i++) {
			Thread.sleep(4000);
			System.out.println(messages[i]);
		}

	}

}