package javaThread;

public class JoinThreadEx1 {

	public static void main(String[] args) {
		JoinThread joinThread = new JoinThread();
		joinThread.start();
		try {
			joinThread.join();//jointhread�� �����Ҷ����� ���� �����尡 �Ͻ� ����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1���� 100������ �� = "+ joinThread.getSum());
		
        

	}

}
