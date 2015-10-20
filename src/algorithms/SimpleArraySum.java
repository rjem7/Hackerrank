package algorithms;

import java.util.Scanner;

public class SimpleArraySum {
	
	static int calculateSum(int[] nums) {
		int sum = 0;
		for (int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int as = scan.nextInt();
		int[] nums = new int[as];
		for(int i=0;i<as;i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println(calculateSum(nums));
		scan.close();
	}

}
