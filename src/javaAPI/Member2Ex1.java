package javaAPI;

public class Member2Ex1 {

	public static void main(String[] args) {
		Member2 original = new Member2("ȫ�浿", 30, new int[] {80,90,75}, new Car("�ҳ�Ÿ"));
		Member2 cloned = original.getMember();
		cloned.scores[1] = 95;
		cloned.car.name = "�׷���";
		System.out.println("���� ��ü");
		System.out.println(original.name);
		System.out.println(original.age);
		for(int i : original.scores) {
			int count=1;
			System.out.println(count+"��° ���� : "+i);
			count++;
		}
		System.out.println(original.car.name);
		System.out.println("------------------");
		System.out.println("���� ��ü");
		System.out.println(cloned.name);
		System.out.println(cloned.age);
		for(int i : cloned.scores) {
			int count=1;
			System.out.println(count+"��° ���� : "+i);
			count++;
		}
		System.out.println(cloned.car.name);

	}

}
