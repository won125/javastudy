package javaAPI;

public class WrapperEx1 {

	public static void main(String[] args) {
		//���� Ŭ����
		Integer obj1 = 100; //�ڵ� �ڽ�
		Integer obj2 = 100;
		if(obj1.equals(obj2)) {
			System.out.println("���� ���Դϴ�.");
		}else {
			System.out.println("�ٸ� ���Դϴ�.");
		}
		System.out.println(obj1);
		int value = obj1; //�ڵ� ��ڽ�
		String str1 = "10";
		String str2 = "20";
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

	}

}
