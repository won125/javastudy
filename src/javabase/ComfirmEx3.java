package javabase;

import java.util.Scanner;

public class ComfirmEx3 {

	public static void main(String[] args) {
		boolean run=true;
		
		int balance=0;
		int choice=0;
		int money=0;
		
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.print("����>>");
			
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("���ݾ�>>");
				balance=sc.nextInt();
				money+=balance;
				break;
			case 2:
				System.out.print("��ݾ�>>");
				balance=sc.nextInt();
				money-=balance;
				break;
			case 3:
				System.out.println("�ܰ�>"+money);
				break;
			case 4:
				System.out.println("���α׷� ����");
				run=false;
				break;
			}
		}

	}

}
