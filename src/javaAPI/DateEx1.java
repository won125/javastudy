package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� (hh�� mm�� ss��)");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� (E)");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy�� D��");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy�� MM�� dd�� (HH�� mm�� ss��)");
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy�� MM�� dd��-w���� (a hh�� mm�� ss��)");
		System.out.println(sdf5.format(date));

	}

}
