package javaException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try{
			int num1=10;
			int num2=5;
			String str = "�ȳ��ϼ���";
			int[] nums = {10,20,30};
			int resualt = num1/num2;
			String data1 = "200";
			String data2 = "a300";
			System.out.println("��� ��� : "+resualt);
			System.out.println(str.toString());
			System.out.println(nums[2]);
			System.out.println(Integer.parseInt(data1)+Integer.parseInt(data2));
		}catch (NullPointerException e) {
			System.out.println("���ڸ� �����ϰ� ���� �ʽ��ϴ�.");
		}catch (ArithmeticException e){
			System.out.println("0���� ���� ���� �����ϴ�.");
		}catch(Exception e) {
			System.out.println("�����ڿ��� �����ϼ���(010-0000-0000"+e.getMessage());
		}
		finally {
			System.out.println("���� �ٽ� Ȯ���ϰ� �����ϼ���.");
		}
			

	}

}
