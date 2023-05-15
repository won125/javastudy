package javaClass;
// �簢�� ���� Ŭ����
public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width,	int height) throws Exception{
		if(this.width<=0 || height<=0) {
			throw new Exception("�ʺ�� ���̴� �÷��� ���̾�� �մϴ�.");
		}
		this.height = height;
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws Exception {
		if(width<=0) {
			throw new Exception("�ʺ�� ���� �Ǵ� 0 �̵� �� �����ϴ�.");
		}
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) throws Exception {
		if(height<=0) {
			throw new Exception("���̴� ���� �Ǵ� 0 �̵� �� �����ϴ�.");
		}
		this.height = height;
	}

	int getArea() {
		return width * height;
	}
	
	void printRectangle() {
		System.out.println("�簢���� �ʺ� : "+this.width);
		System.out.println("�簢���� ���� : "+this.height);
	}

}
