package javabase;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money=sc.nextInt();
		int manwon=0;
		int ocheonwon=0;
		int cheonwon=0;
		int obackwon=0;
		int backwon=0;
		int sipwon=0;
		
		manwon = money/10000;
		money = money%10000;
		
		ocheonwon = money/5000;
		money = money%5000;
		
		cheonwon = money/1000;
		money = money%1000;
		
		obackwon = money/500;
		money = money%500;
		
		backwon = money/100;
		money = money%100;
		
		sipwon = money/10;
		money = money%10;
		
		System.out.println("������>>"+manwon+"��");
		System.out.println("��õ����>>"+ocheonwon+"��");
		System.out.println("õ����>>"+cheonwon+"��");
		System.out.println("�����>>"+obackwon+"��");
		System.out.println("���>>"+backwon+"��");
		System.out.println("�ʿ�>>"+sipwon+"��");

	}

}
