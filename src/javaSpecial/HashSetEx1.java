package javaSpecial;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("java");
		set1.add("html");
		set1.add("css");
		set1.add("react");
		System.out.println("�� ��ü�� : "+ set1.size());
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { //��ü�� ���� ���� Ȯ��
			String subject = iter.next(); // iter ��ü���� �� ���� �ڷḦ �����´�.
			System.out.println(subject);
		}

	}

}
