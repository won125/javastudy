package APIConfirm;

public class StringBuilderEx1 {

	public static void main(String[] args) {
		String str = "";
		for(int i=1;i<=100;i++) {
			str+=i;
		}
		System.out.println(str);
		//�����ڵ�
		StringBuilder sd = new StringBuilder();
		for(int i=1;i<=100;i++) {
			sd.append(i);
		}
		str = sd.toString();
		System.out.println(str);

	}

}
