package javaClass;
//���� ���� Ŭ����
public class Account{
	static String bankName = "��������";
	String account_No; //���¹�ȣ
	String  name; //������ �̸�
	int money; //�ܾ�
	
	// ������
	Account(String account_No, String  name,int money){
		this.account_No = account_No;
		this.money = money;
		this.name = name;
	}
	
	//����Ʈ ������
	Account(){
		
	}
	
	//�ż���
	//����
	void deposit(int amount) {
		money+=amount;
	}
	//����
	int withdraw(int amount) throws Exception{
		if(money<amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		money-=amount;
		return amount;
	}
	
	//��ü ��� �ż���
	void printAccount(Account obj) {
		System.out.println("���¹�ȣ : " + obj.account_No);
		System.out.println("������ �̸� : " + obj.name);
		System.out.println("�� �� : " + obj.money);
		System.out.println("===============================");
	}
}