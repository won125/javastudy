package javaThread;

public class CalcThread extends Thread{
	//������
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		int sum=0;
		for(long i=1;i<=2000000000L;i++) {
			sum+=i;
		}
		System.out.println(getName()+"�� �� �۾�(1~2000000������ ��) = "+sum);
	}

}
