package javaThread;

public class PrintThread2 extends Thread{

	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("���� ������...");
				Thread.sleep(1);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ڿ�����");
		System.out.println("��������");
	}

}
