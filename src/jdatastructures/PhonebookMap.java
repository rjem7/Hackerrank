package jdatastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> book = new HashMap<String, Integer>();
		
		int items = in.nextInt();
		
		for(int i=0;i<items;i++) {
			in.nextLine();
			String name = in.nextLine();
			int ph = in.nextInt();
			String str = String.valueOf(ph);
			int num = 0;
			if(str.length() > 8) {
				num = Integer.parseInt(str.substring(0, 8));
			}
			else {
				num = Integer.parseInt(str);
			}

			book.put(name.trim(), num);
		}
		
		while(in.hasNext()) {
			String query = in.nextLine();
			if(query != null && !query.isEmpty()) {
				if(book.containsKey(query.trim().toLowerCase())) {
					System.out.println(query + "=" +book.get(query));
				}
				else {
					System.out.println("Not found");
				}
			}
		}
		
		in.close();
	}

}
