package javaClass;
// ��ü ���� ����
public class PhysicalInfo {
	//�ʵ�
	String name; // �̸�
	int age; // ����
	float height; // Ű
	float weight; // ������
	
	//������
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	//�ż���
	void update(int age,float height, float weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	//�ż��� �����ε�
	void update(int age,float height) {
		this.age=age;
		this.height=height;
	}
	
	//�ż��� �����ε�
		void update(int age) {
			this.age=age;
		}

}
