package mypack;

import java.util.Scanner;
import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = Integer.parseInt(sc.nextLine());
		int[] arr = new int[size];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Maximum element in the array : "+max);
	}

}
