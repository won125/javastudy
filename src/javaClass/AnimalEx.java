package javaClass;

public class AnimalEx {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		tiger.name = "ȣ����";
		tiger.age = 2;
		eagle.name = "����";
		eagle.home = "�ҳ�������";
		System.out.println(tiger.name+"�� "+tiger.age+"�� �Դϴ�.");
		tiger.move();
		System.out.println(eagle.name+"�� ���� "+eagle.home+"�Դϴ�.");
		eagle.move();

	}

}
