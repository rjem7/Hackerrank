package algorithms;

import java.util.Scanner;
// Still to be completed
public class InsertionSort1 {
	
	static void insertIntoSorted(int[] ar) {
		int last = ar[ar.length - 1];
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println(i);
			if(ar[i] > last) {				
				ar[i+1] = ar[i];
				printArray(ar);
			}
			else if(ar[i] < last) {
				ar[i+1] = last;
				printArray(ar);
			}
		}
		
	}
	
	private static void printArray(int[] ar) {
		for(int a: ar) {
			System.out.print(a + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
		
		in.close();

	}

}
