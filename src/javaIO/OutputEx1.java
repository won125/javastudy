package javaIO;

import java.io.File;
import java.io.FileOutputStream;

public class OutputEx1 {

	public static void main(String[] args) {
		File saveFile = new File("C:/taewon_kim/javaproject/file/save.txt");
		try {
			FileOutputStream fileOS = new FileOutputStream(saveFile);
			String memo = "������ ����˴ϴ�. �� �������� ������ ������ �ڹٱ��� ���� ����";
			fileOS.write(memo.getBytes());
			fileOS.close();
			System.out.println("save.txt ������ ����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("������ ������ �� �����ϴ�.");
		}

	}

}
