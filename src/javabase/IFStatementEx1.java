package javabase;

import java.util.Scanner;

public class IFStatementEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("�����Է�>>");
		score=sc.nextInt();
		
		if(score>=90) {
			System.out.println("A����Դϴ�.");
		}else if(score<90 && score>=80) {
			System.out.println("B����Դϴ�.");
		}else if(score<80 && score>=70) {
			System.out.println("C����Դϴ�.");
		}else if(score<70 && score>=60) {
			System.out.println("D����Դϴ�.");
		}else {
			System.out.println(" F����Դϴ�.");
		}
		

	}

}
