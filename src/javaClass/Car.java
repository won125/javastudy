package javaClass;

public class Car {
	//�ʵ�
	/*
	Tire frontLeftTire = new Tire("�� ���� Ÿ�̾�", 6);
	Tire frontRightTire = new Tire("�� ������ Ÿ�̾�", 4);
	Tire BackLeftTire = new Tire("�� ���� Ÿ�̾�", 3);
	Tire BackRightTire = new Tire("�� ������ Ÿ�̾�", 5);
	*/
	
	Tire[] tires = {
			new Tire("�� ���� Ÿ�̾�", 6),
			new Tire("�� ������ Ÿ�̾�", 4),
			new Tire("�� ���� Ÿ�̾�", 3),
			new Tire("�� ������ Ÿ�̾�", 5)
	};
	//������
	
	//�ż���
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		for(int i=0;i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
