package javaClass;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Account chulsu = new Account();
		chulsu.account_No = "111-222-33333";
		chulsu.name = "��ö��";
		chulsu.money = 1500;
		Account younghee = new Account();
		younghee.account_No = "111-333-55555";
		younghee.name = "�̿���";
		younghee.money = 0;
		Scanner sc = new Scanner(System.in);
		int money=0;
		int select_Num;
		boolean run=true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.�� �� | 2.�� �� | 3.�ܾ� ��ȸ | 4.�� ��");
			System.out.println("----------------------------------------");
			System.out.print("����>>");
			select_Num = sc.nextInt();
			switch(select_Num) {
			case 1:
				System.out.println("-----------------------------");
				System.out.println("         ��      ��");
				System.out.println("-----------------------------");
				System.out.print("�Աݾ�>>");
				money = sc.nextInt();
				chulsu.deposit(money);
				System.out.println("�Ա� �� �ܾ� >> "+chulsu.money);
				break;
			case 2:
				System.out.println("-----------------------------");
				System.out.println("         ��      ��");
				System.out.println("-----------------------------");
				System.out.print("��ݾ�>>");
				money = sc.nextInt();
				try {
					chulsu.withdraw(money);
					System.out.println("��� �� �ܾ� >> "+chulsu.money);
					break;
				}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("ã�� �޾� : "+ money);
				System.out.println("�� �� : "+chulsu.money);
				break;
				}
			case 3:
				System.out.println("-----------------------------");
				System.out.println("        �ܾ�     ��ȸ");
				System.out.println("-----------------------------");
				System.out.println(" �ܾ� >> "+chulsu.money);
				break;
			case 4:
				System.out.println("���α׷� ����");
				run=false;
				break;
				default:
					System.out.println("Input Error!!!!!");
					break;
			}
		}

	}

}
