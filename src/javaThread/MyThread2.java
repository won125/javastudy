package javaThread;

public class MyThread2 extends Thread{
	//�ʵ�
	private Calc calc;
	//�޼���
	public void setCalc(Calc calc) {
		this.setName("MyThread2");
		this.calc=calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(50);
		
	}

}
