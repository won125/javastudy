package javaSpecial;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("hong", "12345");
		map.put("kim", "11111");
		map.put("young", "22222");
		map.put("son", "77777");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("================================");
			System.out.println();
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("ID >> ");
			String id = sc.next();
			System.out.print("Password >> ");
			String password = sc.next();
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� ����!!!");
					break;
				}else {
					System.out.println("�Է��Ͻ� ���̵��� ��й�ȣ�� �ٸ��ϴ�.");
				}
			}else {
				System.out.println("�Է��ϴ� ���̵� �������� �ʽ��ϴ�.");
			}
		}

	}

}
