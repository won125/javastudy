package javaThread;

public class ThreadA extends Thread{
	//������
	public ThreadA() {
		setName("������A");
	}
	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(getName()+"�� �� �۾� 1����100������ �� = "+sum);
	}

}
