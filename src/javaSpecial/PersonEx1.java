package javaSpecial;

public class PersonEx1 {

	public static void main(String[] args) {
		//�Ϲ����� �͸� ��ü ����
		/*Person gildong = new Person() {
			
			@Override
			public void info() {
				System.out.println("���� ���ο� ��� �浿�Դϴ�.");
				
			}
		};
		gildong.info();*/
		
		//���ٽ� �͸� ��ü ����
		/*Person gildong;		//��ü �ʵ� ����
		gildong = () -> {
			System.out.println("���� ���ο� ��� �浿�Դϴ�.");
			System.out.println("�ڹ� �� ������ ���� �ֽ��ϴ�.");
		};
		gildong.info();*/
		
		Person gildong;
		gildong = () -> System.out.println("���� ���ο� ��� �浿�Դϴ�.");
		gildong.info();

	}

}
