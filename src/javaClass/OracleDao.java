package javaClass;

public class OracleDao implements DataAccesObject{
	
	private String db= "Oracle";

	@Override
	public void insert() {
		System.out.println(db+" DB���� ����");
		
	}

	@Override
	public void select() {
		System.out.println(db+" DB���� �˻�");
		
	}

	@Override
	public void update() {
		System.out.println(db+" DB���� ����");
		
	}

	@Override
	public void delete() {
		System.out.println(db+" DB���� ����");
		
	}

}
