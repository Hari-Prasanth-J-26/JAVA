package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DecodeString {
	
	public static String decodeString(String input) {
		
		StringBuilder sb = new StringBuilder(input);
		char[] ch = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : ch) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		//System.out.println(map);
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		int maxCount = 0;
		char maxChar = 0;
		for(Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}
//		System.out.println(maxCount);
//		System.out.println(maxChar);
//		System.out.println(sb.reverse().append(maxChar).append(maxCount));
		return sb.reverse().append(maxCount).append(maxChar)+"";		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//decodeString(input);
		System.out.println(decodeString(input));

	}

}
