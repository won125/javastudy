package javaThread;

public class MyThread1 extends Thread{
	//�ʵ�
	private Calc calc;
	//�޼���
	public void setCalc(Calc calc) {
		this.setName("MyThread1");
		this.calc=calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(100);
		
	}

}
