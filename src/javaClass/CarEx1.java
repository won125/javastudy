package javaClass;

public class CarEx1 {

	public static void main(String[] args) {
		Car chulsuCar = new Car();
		
		for(int i=1;i<=7;i++) {
			int problemLocation = chulsuCar.run();
			if(problemLocation!=0) {
				System.out.println(chulsuCar.tires[problemLocation-1].location + "HankookTire�� ��ü");
				chulsuCar.tires[problemLocation-1] = new HankiikTire(chulsuCar.tires[problemLocation-1].location, 15);
			}
			/*
			 switch(problemLocation) {
			 
			case 1:
				System.out.println("�� ���� KumhoTire�� ��ü");
				chulsuCar.frontLeftTire = new KumhoTire("�� ����", 15);
				break;
			case 2:
				System.out.println("�� ������ KumhoTire�� ��ü");
				chulsuCar.frontRightTire = new KumhoTire("�� ������", 12);
				break;
			case 3:
				System.out.println("�� ���� HankookTire�� ��ü");
				chulsuCar.BackLeftTire = new HankiikTire("�� ����", 10);
				break;
			case 4:
				System.out.println("�� ������ HankookTire�� ��ü");
				chulsuCar.BackRightTire = new HankiikTire("�� ������", 13);
				break;
			}
			*/
			System.out.println("--------------------------------");
		}

	}

}
