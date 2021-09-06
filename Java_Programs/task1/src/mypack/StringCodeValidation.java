package mypack;

import java.util.Scanner;

public class StringCodeValidation {
	

	
	public static int validateColorCode(String input) {
		int result = 0;
		if(input.matches("[#]{1}[A-Z0-9]{6}")){
			result = 1;
		}
		else {
			result = -1;
		}
		return result;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int output = validateColorCode(input);
		System.out.println(output > 0 ? "Valid" : "Invalid");
	}

}
