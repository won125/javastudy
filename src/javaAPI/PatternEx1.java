package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {
		// ���� ǥ����
		Scanner sc = new Scanner(System.in);
		String regExp="(02|010)-\\d{3,4}-\\d{4}";
		System.out.print("��ȭ��ȣ�� �Է��Ͻÿ�>>");
		String data = sc.next();
		System.out.println();
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("��ȭ��ȣ ������ ��ġ�մϴ�.");
		}else {
			System.out.println("��ȭ��ȣ ���İ� Ʋ���ϴ�.");
		}
		System.out.print("�̸��� �Է�>>");
		String email = sc.next();
		String regExpEmail = "\\w+@\\w+(\\.+\\w+)?";
		result = Pattern.matches(regExpEmail, email);
		if(result) {
			System.out.println("�̸��� �ּ� ������ ��ġ�մϴ�.");
		}else {
			System.out.println("�̸��� �ּ� ���İ� Ʋ���ϴ�.");
		}
		
		

	}

}
