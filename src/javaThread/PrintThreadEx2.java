package javaThread;

public class PrintThreadEx2 {

	public static void main(String[] args) {
		PrintThread2 printThread2 = new PrintThread2();
		printThread2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		printThread2.interrupt();

	}

}
