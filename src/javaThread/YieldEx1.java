package javaThread;

public class YieldEx1 {

	public static void main(String[] args) {
		ThreadJob1_yield tJob1 = new ThreadJob1_yield();
		ThreadJob2_yield tJob2 = new ThreadJob2_yield();
		
		tJob1.start();
		tJob2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		//ù��° ������ �纸 ���
		tJob1.work=false;
		//
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		//ù��° ������ �ٽ� ����
		tJob1.work=true;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		tJob1.stop=true;
		tJob2.stop=true;

	}

}
