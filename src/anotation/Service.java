package anotation;

public class Service {
	//�ż���
	@PrintAnnotation
	public void method1(){
		System.out.println("�ż���1 ����");
		
	}
	@PrintAnnotation("*")
	public void method2(){
		System.out.println("�ż���2 ����");
	}
	@PrintAnnotation(value="#",number=20)
	public void method3(){
		System.out.println("�ż���3 ����");
	}

}
