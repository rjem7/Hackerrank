package algorithms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Panagram {
	
	static void checkPan(String s) {
		StringTokenizer tok = new StringTokenizer(s, " ");
		StringBuilder sb = new StringBuilder();
		Set<String> st = new HashSet<String>();
		while(tok.hasMoreTokens()) {
			sb.append(tok.nextToken());
		}
		
		
		for(int i=0; i<sb.length(); i++) {
			st.add(String.valueOf(sb.charAt(i)));
		}
		
		if(st.size() == 26) {
			System.out.println("pangram");
		}
		else {
			System.out.println("not pangram");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		checkPan(s.toLowerCase());
		
		scan.close();
	}

}
