package javaSpecial;

public class Person3Ex1 {

	public static void main(String[] args) {
		Person3 younghee;
		
		younghee = (h,w) -> {
			String result = "�� ������ " + h + " cm�̰�, �����Դ� " + w + " kg �̴�.";
			return result;
		};
		System.out.println(younghee.info(156, 45));

	}

}
