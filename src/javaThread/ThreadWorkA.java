package javaThread;

public class ThreadWorkA extends Thread{
	//��ü �ʵ�
	private WorkObject object;
	//������
	public ThreadWorkA(WorkObject object) {
		this.object = object;
	}
	//�ż��� �������̵�
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			object.methodA();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	
	}

}
