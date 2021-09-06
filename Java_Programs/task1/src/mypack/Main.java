package mypack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int output = UserMainCode.validateColorCode(input);
		System.out.println(output > 0 ? "Valid" : "Invalid");
		sc.close();

	}

}
