package javaSpecial;

public class Person2Ex1 {

	public static void main(String[] args) {
		Person2 chanho;
		/*chanho=(age) -> {
			int myage = age+1;
			System.out.println("�� ���̴�" + myage + "�Դϴ�.");
		};
		chanho.info(27);*/
		chanho = age -> System.out.println("�� ���̴�" + age + "�Դϴ�.");
		chanho.info(30);

	}

}
