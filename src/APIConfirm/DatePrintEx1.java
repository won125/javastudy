package APIConfirm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(now));

	}

}
