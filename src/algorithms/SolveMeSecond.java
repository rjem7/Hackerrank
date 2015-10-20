package algorithms;

import java.util.Scanner;

public class SolveMeSecond {

	static int calculateSum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int a, b;
		for(int i=0;i<t;i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(calculateSum(a, b));
		}
		scan.close();

	}

}
