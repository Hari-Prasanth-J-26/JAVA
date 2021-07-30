package mypack;

import java.util.Scanner;

public class Problem6 {
	
	public static boolean isPalindromeNumber(int num) {
		int r, sum=0, temp;  
		temp = num;
		while(num>0){    
			r=num%10;   
			sum=(sum*10)+r;    
			num=num/10;    
		}    
		if(temp == sum)
			return true;
		return false;
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
		System.out.println("Palindrome numbers in array : ");
		for (int i = 0; i < arr.length; i++) {
			if(isPalindromeNumber(arr[i]))
				System.out.println(arr[i]);
		}
		
	}

}
