package javaAPI;

public class SystemTimeEx1 {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		//long time1 = System.nanoTime();
		System.out.println(time1);
		int sum = 0;
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		long time2 = System.currentTimeMillis();
		//long time2 = System.nanoTime();
		System.out.println("1���� 100������ �� = " + sum);
		System.out.println("����۾��� " + (time2-time1) + "�ʰ� �ҿ��");

	}

}
