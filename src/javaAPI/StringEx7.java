package javaAPI;

public class StringEx7 {

	public static void main(String[] args) {
		String text = "ȫ�浿,��ö��,����ȣ,�̿���,������";
		String[] names = text.split(",");
		for(String na : names) {
			System.out.println(na);
		}

	}

}
