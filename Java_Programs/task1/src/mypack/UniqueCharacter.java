package mypack;

import java.util.Scanner;

public class UniqueCharacter {
	
	public static String toFindFirstUniqueCharacter(String input) {
		String result = "";
		for(int i=0;i<input.length();i++) {
			int count = 0;
			for(int j=0;j<input.length();j++) {
				if(input.charAt(i) == input.charAt(j))
					count++;
			}
			if(count == 1) {
				result += input.charAt(i);
			}
			
		}
		return result.charAt(0)+"";
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(toFindFirstUniqueCharacter(input));
	}

}
