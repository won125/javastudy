package javabase;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random_num = (int)(Math.random()*100)+1;
		int select_num=0;
		int chance=1;
		boolean play=true;
		
		while(play) {
			System.out.print("���� �Է�>>");
			select_num=sc.nextInt();
			if(select_num==random_num) {
				System.out.println(chance+"�� ���� ������ �����̽��ϴ�.");
				play=false;
			}
			else {
				if(select_num>random_num) {
					System.out.println("�Է��� ���� �ʹ� �޴ϴ�. �ٽ� �Է����ֽʽÿ�.");
					chance++;
				}
				else {
					System.out.println("�Է��� ���� �ʹ� �۽��ϴ�. �ٽ� �Է����ֽʽÿ�.");
					chance++;
				}
			}
			
		}
		System.out.println("������ ����Ǿ����ϴ�.");

	}

}
