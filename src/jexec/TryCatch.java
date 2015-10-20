package jexec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		try {
			a = scan.nextInt();
			b = scan.nextInt();
			
			System.out.println(a/b);
			
		} catch(InputMismatchException ime) {
			System.out.print(ime.getClass().getName());
			
		} catch(ArithmeticException ae) {
			System.out.print(ae);
		}
		
		scan.close();
	}

}
