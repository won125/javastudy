package javaSpecial;

public class CalcEx1 {

	public static void main(String[] args) {
		Calc cal;
		
		cal = (a,b) -> {
			int result = a+b;
			return result;
		};
		System.out.println(cal.hap(10, 20));
		//������ ��ɹ��� �� ���϶�
		cal = (a,b) -> {return a+b;};
		System.out.println(cal.hap(20, 30));
		//������ ��ɹ��� �� ���϶� ���Ϲ��� �߰�ȣ�� ����
		
		cal = (a,b) -> a+b;;
		System.out.println(cal.hap(30, 40));
		//���� �޼��带 ȣ���ؼ� ó��
		cal = (a,b) -> sum(a,b);
		System.out.println(cal.hap(40, 50));
		//���� ���ϴ� �޼���
		

	}
	public static int sum(int a, int b) {
		return a+b;
	}

}
