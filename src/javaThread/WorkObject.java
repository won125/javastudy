package javaThread;

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadWork�� methodA �۾� ����");
		notify(); // �Ͻ����� => ���������
		try {
			wait(); // �Ͻ�����
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadWork�� methodB �۾� ����");
		notify(); // �Ͻ����� => ���������
		try {
			wait(); // �Ͻ�����
		} catch (InterruptedException e) {
		}
	}

}
