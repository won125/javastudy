package javaThread;

public class StartThread extends Thread{
	//��ü �ʵ�
	private Thread targetThread;
	//������
	public StartThread(Thread target) {
		targetThread = target;
	}
	//�޼���
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("���� ������ ���� : "+state);
			if(state == Thread.State.NEW) { // �������¶�� => ��������·� ���� 
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) { // 
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}

}
