package javaSpecial;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		//�˻������ ��ȭ�� �÷��� �����ӿ�ũ 
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(80);
		scores.add(90);
		scores.add(70);
		scores.add(88);
		scores.add(97);
		scores.add(67);
		scores.add(84);
		System.out.println("���� ���� ���� : " + scores.first());
		System.out.println("���� ���� ���� : " + scores.last());
		System.out.println("85���� ���� ���� : " + scores.higher(85));
		System.out.println("80���� �Ʒ� ���� : " + scores.lower(80));

	}

}
