package javaAPI;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "���Ϻ��� ��̳� �޹�";
		System.out.println(str);
		char ch = str.charAt(7);
		System.out.println(ch);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ �Է� >> ");
		String jumin = sc.next();
		ch = jumin.charAt(7);
		if(jumin.length()==14) {
			if(ch=='1' || ch=='3') {
				System.out.println("�����Դϴ�.");
			}else if(ch=='2' || ch=='4') {
				System.out.println("�����Դϴ�.");
			}else {
				System.out.println("�߸��� �ֹε�Ϲ�ȣ�Դϴ�.");
			}
		}else {
			System.out.println("�߸��� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		

	}

}
