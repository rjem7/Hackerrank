package algorithms;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] numArr = new int[count];
		for(int i=0;i<count;i++) {
			numArr[i] = scan.nextInt();
		}
		
		float zero = 0 ,minus = 0, plus = 0;
		for(int j=0;j<numArr.length;j++) {
			if(numArr[j] == 0) {
				zero++;
			}
			else if(numArr[j] < 0) {
				minus++;
			}
			else {
				plus++;
			}
		}
		
		System.out.format("%.3f", plus/numArr.length);
		System.out.println("");
		System.out.format("%.3f", minus/numArr.length);
		System.out.println("");
		System.out.format("%.3f", zero/numArr.length);
		
		
		scan.close();

	}

}
