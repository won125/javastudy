package javaClass;

public class AccountEx2 {

	public static void main(String[] args) {
		Account gildong = new Account("111-222-66666", "ȫ�浿", 10);
		Account chanho = new Account("333-888-77777", "����ȣ", 10000);
		gildong.deposit(2000);
		chanho.deposit(600);
		try {
			gildong.withdraw(750);	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*
		System.out.println("���¹�ȣ : " + gildong.account_No);
		System.out.println("������ �̸� : " + gildong.name);
		System.out.println("�� �� : " + gildong.money);
		System.out.println("���¹�ȣ : " + chanho.account_No);
		System.out.println("������ �̸� : " + chanho.name);
		System.out.println("�� �� : " + chanho.money);
		*/
		printAccount(gildong);
		printAccount(chanho);

	}
	
	//���� ���� ��� �ż���
	static void printAccount(Account obj) {
		System.out.println("���¹�ȣ : " + obj.account_No);
		System.out.println("������ �̸� : " + obj.name);
		System.out.println("�� �� : " + obj.money);
		System.out.println("===============================");
	}

}
