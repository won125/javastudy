package javaAPI;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		int[] scores = {75,69,80,90,95};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 90);
		System.out.println("ã�� ��ġ = " + index);
		
		String[] names = {"ȫ�浿", "��ö��", "�̿���"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� ��ġ = " + index);

	}

}
