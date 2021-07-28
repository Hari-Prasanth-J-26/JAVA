package mypack;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url : ");
		String email = sc.nextLine();
		if(email.startsWith("https"))
			System.out.println("Secure");
		else
			System.out.println("Not Secure");

	}

}
