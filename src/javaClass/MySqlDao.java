package javaClass;

public class MySqlDao implements DataAccesObject{
	
	private String db= "MySql";

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
