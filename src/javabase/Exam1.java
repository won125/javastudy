package javabase;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("���ڸ� �Է����ֽʽÿ�>>");
		num = sc.nextInt();
		int [][] arr = new int[num][num];
		int max=num;
		int n=1;
		int row = 0;
		int column = -1;
		int delta = 1;
		
		// �迭�� �Է¹ޱ�
		while (max >= 0) {
			
			// ���Է�
			for (int i = 0; i < max; i++) {
				column += delta;
				arr[row][column] = n++;
			}
			
			// �ݺ�Ƚ�� ����
			max--;
			
			// ���Է�
			for (int i = 0; i < max; i++) {
				row += delta;
				arr[row][column] = n++;
			}
			
			// ������ȯ
			delta *= -1;
			
		}
		
		// �迭 ���
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
