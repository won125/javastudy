package javabase;

import java.util.Scanner;

public class OperatorEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� >> ");
		int amount=sc.nextInt();
		System.out.print("���� �ܰ� >> ");
		int price=sc.nextInt();
		int total_price=amount*price;
		if(amount>=10 && price>1000) {
			total_price=total_price-(int)(total_price*0.2);
			System.out.println("���� �ݾ� >> "+total_price);
		}
		else {
			System.out.println("���� �ݾ� >> "+total_price);
		}
		
		
		
	}

}
