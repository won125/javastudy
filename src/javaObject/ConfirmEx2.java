package javaObject;

import java.util.Scanner;

public class ConfirmEx2 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		while(run) {
			int select_num=0;
			int max=0;
			double avg=0.0;
			int sum=0;
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����>>");
			select_num = sc.nextInt();
			
			switch(select_num) {
			case 1:
				System.out.println("----�л� �� �Է�----");
				System.out.print("�л� ��>>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				if(studentNum!=0) {
					System.out.println("----���� �Է�----");
					for(int i=0;i<studentNum;i++) {
						System.out.print("scores["+i+"]: ");
						scores[i]=sc.nextInt();
					}
					break;
				}else {
					System.out.println("�л� ���� ������ �ֽʽÿ�.");
					break;
				}
				
			case 3:
				System.out.println("----���� ����Ʈ----");
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]: "+ scores[i]);
				}
				break;
			case 4:
				System.out.println("----���� �м�----");
				for(int i:scores) {
					if(i>max) {
						max=i;
					}
					sum+=i;
				}
				avg=(double)sum/scores.length;
				System.out.println("�ְ� ���� : "+max);
				System.out.println("��� ���� : "+avg);
				break;
			case 5:
				run=false;
				break;
			default: 
				System.out.println("Input Error!!!!");
				break;
			}
		}
		System.out.println("���α׷� ����!!");

	}

}
