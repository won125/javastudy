package javaAPI;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		//Random Ŭ����
		int mynum[] = new int[6];
		Random rand1 = new Random(5);
		System.out.print("���� ������ ��ȣ : ");
		for(int i=0;i<6;i++) {
			mynum[i] = rand1.nextInt(45)+1;
			System.out.print(mynum[i]+" ");
		}
		System.out.println();
		int lottoNum[] = new int[6];
		Random rand2 = new Random(3);
		System.out.print("�̹��� ��÷ ��ȣ : ");
		for(int i=0;i<6;i++) {
			lottoNum[i] = rand2.nextInt(45)+1;
			System.out.print(lottoNum[i]+" ");
		}
		System.out.println();
		Arrays.sort(lottoNum);
		Arrays.sort(mynum);
		boolean result = Arrays.equals(mynum, lottoNum);
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�!!!!");
		}else {
			System.out.println("���� ��ȸ��....");
		}

	}

}
