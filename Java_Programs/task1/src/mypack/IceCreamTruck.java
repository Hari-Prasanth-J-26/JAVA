package mypack;

import java.util.Scanner;

public class IceCreamTruck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result ="";
		int runs = sc.nextInt();
		for(int i=0;i<runs;i++) {
			int kid1 = sc.nextInt();
			int kid2 = sc.nextInt();
			int truck = sc.nextInt();
			
			int diff1 = truck - kid1;
			int diff2 = truck - kid2;
			
			result = Math.abs(diff1) < Math.abs(diff2) ? "Kid 1" : "Kid 2";
			if(Math.abs(diff1) == Math.abs(diff2))
				result = "Truck";
			
			System.out.println(result);
		}
	}

}
