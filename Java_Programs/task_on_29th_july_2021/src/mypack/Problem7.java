package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
	
	public static boolean isPrimeNumber(int num) {
		boolean flag = true;
		if(num>0 && num<3)
			return flag;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i==0)
				flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = Integer.parseInt(sc.nextLine());
		int[] arr = new int[size];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Prime numbers in array : ");
		for (int i = 0; i < arr.length; i++) {
			if(isPrimeNumber(arr[i])) 
				System.out.println(arr[i]);
		}
		
		
	}

}
