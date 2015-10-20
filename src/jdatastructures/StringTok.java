package jdatastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTok {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		if(s.length() < 400000 && s.matches("[A-Za-z !,?.\\_'@]+")) {
			String[] strs = s.split("[ !,?.\\_'@]");
			List<String> lstr = new ArrayList<String>();
			
			for(int i=0; i< strs.length; i++) {
				if(strs[i].length() > 0) {
					lstr.add(strs[i]);
				}
			}
			System.out.println(lstr.size());
			for(String st: lstr) {
				System.out.println(st);
			}
			
		}
		
		scan.close();

	}

}
