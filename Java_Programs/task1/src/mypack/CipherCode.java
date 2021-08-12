package mypack;

import java.util.Scanner;

public class CipherCode {
	
	public static void convertStringtoCipher(String input) {
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				int code = input.charAt(i) - 'A' + 1;
				System.out.printf("%02d", code);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		convertStringtoCipher(input);
	}

}
