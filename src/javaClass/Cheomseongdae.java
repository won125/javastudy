package javaClass;

public class Cheomseongdae {
	private static Cheomseongdae cheomseongdae = new Cheomseongdae();
	
	//������
	private Cheomseongdae() {
		
	}
	
	//���� �ż���
	static Cheomseongdae getIntance() {
		return cheomseongdae;
	}
	
	void history() {
		System.out.println("���翡�� ���� ������ ������");
	}

}
