package javaSpecial;

public class ChildProductEx1 {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product1 = new ChildProduct<Tv, String, String>();
		
		product1.setKind(new Tv());
		product1.setModel("����Ʈ TV");
		product1.setCompany("�Ｚ");
	}

}
