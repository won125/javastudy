package javaClass;

public class CheomseongdaeEx1 {

	public static void main(String[] args) {
		Cheomseongdae cheom1 = Cheomseongdae.getIntance();
		Cheomseongdae cheom2 = Cheomseongdae.getIntance();
		
		if(cheom1==cheom2) {
			System.out.println("���� ���� ��ü�Դϴ�.");
		}else {
			System.out.println("���� ��ü�� �ƴմϴ�.");
		}
		
		
		cheom1.history();
		cheom2.history();

	}

}
