package APIConfirm;

import java.util.regex.Pattern;

public class PatternMatcherEx1 {

	public static void main(String[] args) {
		String id = "Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		}else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}

	}

}
