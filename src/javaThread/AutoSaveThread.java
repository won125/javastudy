package javaThread;

public class AutoSaveThread extends Thread{
	//�޼���
	public void save() {
		System.out.println("�۾� ������ �����.");
	}
	//�ż��� �������̵�
	@Override
	public void run() {
		while(true) {
			System.out.println("���� �۾���.......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			save();
		}
	}

}
