package javabase;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] score = {80,70,90,60,88};
		int total=0;
		for(int i=0;i<5;i++) {
			total+=score[i];
		}
		System.out.println("���� = "+total);
		System.out.println("��� = "+total/5);

	}

}
