package mypack;

import java.util.Scanner;
import java.util.Stack;

public class StringReverseInsideBraces {
	
	public static String reverseString(String input, int start, int end) {
		StringBuilder output = new StringBuilder();
		for(int i=end-1;i>start;i--) {
			output.append(input.charAt(i));
		}
		return output+"";
	}
	
	public static String removeBraces(String input) {
		Stack<Character> value = new Stack<>();
		int k = 0;
		for (int i = 0; i < input.length(); i++) {
			char x = input.charAt(i);
			if(x == '{') {
				value.push(x);
				k = i;
			}
			else if(x =='}') {
				if(!value.empty()) {
					value.pop();
					String result = reverseString(input, k , i);
					input = input.replace(input.substring(k+1, i), result);
				}
				else {
					return "-404";
				}
			}
		}
		return input.replaceAll("\\p{P}", "");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(removeBraces(input));

	}

}
