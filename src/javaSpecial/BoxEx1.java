package javaSpecial;

public class BoxEx1 {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setT("ȫ�浿");
		String name = box.getT();
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(28);
		int age = box2.getT();
		System.out.println("�̸� : " + name + "\n���� : " + age);
		
		

	}

}
