package ClassConfirmEx;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService memberservice = new MemberService();
		boolean resualt = memberservice.login("hong","12345");
		if(resualt) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberservice.logout("hong");
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}

	}

}
