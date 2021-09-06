package mypack;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class PowerOfString {
	
	public static int characterPower(int size, String input) {
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = input.toCharArray();
		for (char c : ch) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		int sum = 0, value = 0;	
		for(Entry<Character, Integer> e:map.entrySet()) {
			char alphabet = e.getKey();
			int count = e.getValue();
			if(alphabet >= 'a' && alphabet <= 'z') {
					value = alphabet - 'a' + 1;
			}
			sum += Math.pow(value, count);
		}	
		return sum;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int size = input.length();
		System.out.println(characterPower(size, input));
		

	}

}
