package javabase;

import java.util.Scanner;

public class Operator7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("���� �Է����ֽÿ� >> ");
		num1=sc.nextInt();
		int num2;
		System.out.print("���� �Է����ֽÿ� >> ");
		num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("�� ���� ū ���� = "+num1);
		}else if(num1<num2) {
			System.out.println("�� ���� ū ���� = "+num2);
		}else {
			System.out.println("�� ���� �����ϴ�.");
		}
		sc.close();

	}

}
