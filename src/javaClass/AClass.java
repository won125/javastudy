package javaClass;

public class AClass {
	
	public AClass() {
		System.out.println("AClass�� ������");
	}
	//���ο� �ִ� �ν��Ͻ� Ŭ����
	class BClass{
		//�ʵ�
		int bfield;
		//������
		public BClass() {
			System.out.println("BClass�� ������");
		}
		//�ż���
		void bmethod() {
			
		}
	}
	//���� Ŭ����
	static class CClass{
		
		int cfield;
		static int cfield2l; // ���� �ʵ�
		//������
		public CClass() {
			System.out.println("CClass�� ������");
		}
		//�ż���
		void cMethod() {
			
		}
		//�����ż���
		static void cMethod2() {
			
		}
	}
	void aMethod() {
		//���� Ŭ����
		class DClass{
			//�ʵ�
			int dField;
			//������
			public DClass() {
				System.out.println("DClass�� ������");
			}
			//�ż���
			void dMethod() {
				
			}
		}
		DClass dClass = new DClass();
		dClass.dField=10;
		dClass.dMethod();
	}
	
	

}
