package javabase;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int score=90;
		int bonus=0;
		
		System.out.print("���� �Է��Ͻÿ� : ");
		num=sc.nextInt();
		System.out.println("******" + num + "�� ********");
		for(int i=1;i<10;i++) {
			System.out.println(num + "X" + i + " = " + num*i);
		}
		sc.close();
		
		if(score>=80) {
			bonus=2000;
		}
		System.out.println("������ = "+bonus);
	}

}
