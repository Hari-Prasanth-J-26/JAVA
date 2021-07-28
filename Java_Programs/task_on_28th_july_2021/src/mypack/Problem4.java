package mypack;

import java.util.Scanner;

public class Problem4 {

	public static int findHypotenuse(int a, int b) {
		int c = (int)Math.sqrt(Math.pow(a, 2)+(Math.pow(b, 2)));
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for side a :");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the value for side b :");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Hypotenuse : "+findHypotenuse(a, b));
	}

}
