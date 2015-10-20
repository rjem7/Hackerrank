package algorithms;

import java.util.Scanner;


public class DiagonalDifference {

	static int calculateSum(int[][] arr) {
		int a = 0;
		int b = 0;
		for(int i=0; i<arr.length; i++) {
			a += arr[i][i];
		}
		
		for(int i=0, j= arr.length -1 ;i<arr.length;i++, j--) {
			b += arr[i][j];
		}
		return Math.abs(a-b);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int as = scan.nextInt();
		int[][] arr = new int[as][as];
		
		for(int i=0; i<as; i++) {
			for(int j=0;j<as;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(calculateSum(arr));
		
		scan.close();
	}

}
