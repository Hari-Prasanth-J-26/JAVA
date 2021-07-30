package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

	public static int removeNumberIfFirstAndLastValueIsSame(int[] arr, int len) {
		int first, last, j=0;
		int[] tempArr = new int[len];
		for (int i = 0; i < len; i++) {
			int num1 = arr[i];
			int num2 = arr[i];
			last = num1%10;
			while(num2>=10) {
				num2 /= 10;
			}
			first = num2;
			if(first != last)
				tempArr[j++] = arr[i];
		}
		for (int i = 0; i < tempArr.length; i++) {
			arr[i] = tempArr[i];
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
		int range = removeNumberIfFirstAndLastValueIsSame(arr, len);
		System.out.println("The numbers first and last values are not same : ");
		int[] newArr = new int[range];
		for (int i = 0; i < range; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));

	}

}
