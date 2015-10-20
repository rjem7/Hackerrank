package jdatastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArrayListProblem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer, List<Integer>> numMap = new HashMap<Integer, List<Integer>>();
		//List<String> list = new ArrayList<String>();
		int lines = in.nextInt();
		String s = "";
		in.nextLine();
		for(int i=0; i<lines; i++) {
			s = in.nextLine();
			returnNum(s, numMap);			
		}
		
		System.out.println(numMap);
		in.close();

	}
	
	static void returnNum(String s, Map<Integer, List<Integer>> numMap) {
		Scanner scan = new Scanner(s);
		//Map<Integer, List<Integer>> numMap = new HashMap<Integer, List<Integer>>();
		List<Integer> numList = new ArrayList<Integer>();
		int start = scan.nextInt();
		while(scan.hasNextInt()) {
			numList.add(new Integer(scan.nextInt()));
		}
		numMap.put(start, numList);
		//System.out.println(numList);
		scan.close();
	}

}
