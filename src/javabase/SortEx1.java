package javabase;

public class SortEx1 {

	public static void main(String[] args) {
		int[] nums= {53,78,7,23,62};
		int temp;
		//��Ʈ �� �ڷ� ���
		System.out.println("��Ʈ �� �ڷ� ");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		//��Ʈ �˰��� ����
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		//��Ʈ �� �ڷ� ���
		System.out.println("��Ʈ �� �ڷ�(���� ����)");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		//��Ʈ �� �ڷ� ���
		System.out.println("��Ʈ �� �ڷ� ");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
				//��Ʈ �˰��� ����
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		//��Ʈ �� �ڷ� ���
		System.out.println("��Ʈ �� �ڷ�(���� ����) ");
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();

	}

}
