package javabase;

public class WhileEx {

	public static void main(String[] args) {
		/*
		 int i=1;
		 
		int sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1���� 100������ ���� "+sum+" �Դϴ�.");
		*/
		int num = 1;
		int sum = 0;
		System.out.println("1���� 100���� ���� ���ϴ� �� 3500�� �������� ���� ����� ���ϸ� �ɱ��?");
		while(sum<3500) {
			sum+=num;
			num++;
		}
		System.out.println("������ "+(num-1)+" �Դϴ�.");
		sum=0;
		int i;
		for(i=1;i<=100;i++) {
			if(sum<3500) {
				sum+=i;
				System.out.println(i+" "+sum);
			}else {
				i-=i;
				break;
			}
		}
		System.out.println("������ "+i+" �Դϴ�.");

	}

}
