package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
	
	public static int removeDuplicateElements(int[] arr,int len) {
		int[] tempArr = new int[len];
		int j=0;
		for (int i = 0; i < len-1; i++) {
			if(arr[i]!=arr[i+1])
				tempArr[j++]=arr[i];
		}
		tempArr[j++]=arr[len-1];
		for (int i = 0; i < len; i++) {
			arr[i]=tempArr[i];
		}
		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = Integer.parseInt(sc.nextLine());
		int[] arr = new int[size];
		System.out.println("Enter the array elements : ");
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		Arrays.sort(arr);
		int range = removeDuplicateElements(arr, len);
		System.out.println("After removing dupicate elements : ");
		for (int i = 0; i < range; i++) {
			System.out.println(arr[i]);
		}
	}

}
