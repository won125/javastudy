package javaThread;

public class JobThread extends Thread{
	@Override
	public void run() {
		//for���� �ݺ� ����
		for(long i = 0; i < 2000000000; i++) {
			
		}
		//1�� �Ͻ�����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		//for���� �ݺ� ����
		for(long i = 0; i < 2000000000; i++) {
			
		}
	}

}
