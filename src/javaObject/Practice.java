package javaObject;

import java.util.Calendar;

public class Practice {

	public static void main(String[] args) {
		Week today=Week.SUNDAY;
		String name = today.name(); // ���� ��ü�� ���ڷ� ����
		Calendar cal = Calendar.getInstance();
		// int week = cal.get(Calendar.DAY_OF_WEEK);
		int ordinal = today.ordinal(); // ���� ��ü�� ��ġ�� ���ڷ� ����
		//System.out.println("���ش� = "+week);
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.THURSDAY;
		int resualt1 = day1.compareTo(day2);
		int resualt2 = day2.compareTo(day1);
		System.out.println(resualt1);
		System.out.println(resualt2);
		Week week = Week.valueOf("SUNDAY"); //���ڿ��� ������ ��ü�� ��ȯ
		if(week == Week.SUNDAY || week == Week.SATURDAY) {
			System.out.println("��ſ� �ָ� ��������.");
		}else {
			System.out.println("�����̴� ������ �����ϼ���.");
		}
		
		Week[] days = Week.values(); // ��� ������ ��ü���� ������ ��ȯ�Ͽ� ���
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
