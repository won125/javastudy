package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputEx1 {

	public static void main(String[] args) {
		File dir = new File("C:/taewon_kim/javaproject/file");
		File infoFile = new File("C:/taewon_kim/javaproject/file/info.txt");
		if(dir.exists()==false) {
			dir.mkdir();
			System.out.println("������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("�̹� ������ �����մϴ�.");
		}
		try {
			FileInputStream fileIS = new FileInputStream(infoFile);
			byte[] readBytes = new byte[fileIS.available()];
			fileIS.read(readBytes);
			String str = new String(readBytes);
			System.out.println(str);
			fileIS.close();
		} catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}

	}

}
