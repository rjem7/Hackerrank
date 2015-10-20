package algorithms;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] narr = new int[count];
		for(int a=0;a<count;a++) {
			narr[a] = scan.nextInt();
		}
		
		for(int b=0;b<narr.length;b++) {
			int num = narr[b];
			int[] arr = new int[String.valueOf(narr[b]).length()];
			int i = 0;
			while(num != 0) {
				arr[i] = num%10;
				num /= 10;
				i++;
			}
			int cn = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j] != 0) {
					if(narr[b]%arr[j] == 0) {
						cn++;
					}
				}
			}
			System.out.println(cn);
		}
		scan.close();

	}

}
