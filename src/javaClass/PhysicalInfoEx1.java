package javaClass;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo younghee = new PhysicalInfo("�̿���",10,132.5f,35.5f);
		printPhysicalInfo(younghee);
		younghee.update(11, 145.5f, 40.0f);
		printPhysicalInfo(younghee);
		younghee.update(12, 150.5f, 41.0f);
		printPhysicalInfo(younghee);

	}
	
	static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("�� �� : " + obj.name);
		System.out.println("�� �� : " + obj.age);
		System.out.println(" Ű  : " + obj.height);
		System.out.println("������ : " + obj.weight);
		System.out.println("===============================");
	}

}
