package javaClass;

import java.util.Scanner;

public class CalculatorEx1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int kor,eng,mat;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է�>>");
		kor = sc.nextInt();
		System.out.print("���� ���� �Է�>>");
		eng = sc.nextInt();
		System.out.print("���� ���� �Է�>>");
		mat = sc.nextInt();
		System.out.println("�� �� => "+ cal.total(kor,eng,mat));
		System.out.println("�� �� => "+ cal.average(kor,eng,mat));

	}

}
