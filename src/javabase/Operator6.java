package javabase;

import java.util.Scanner;

public class Operator6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���̸� �Է��Ͻÿ� >> ");
		age=sc.nextInt();
		if(age>=20 && age<=29) {
			System.out.println("������ �����մϴ�.");
		}
		else {
			System.out.println("���� ���ɿ� �ش���� �ʽ��ϴ�.");
		}

	}

}
