package mypack;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url : ");
		String email = sc.nextLine();

		String[] arr = email.split("/");
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		System.out.println(Arrays.toString(arr));
		
		*/
		System.out.println("domain name : "+arr[2]);

	}

}
