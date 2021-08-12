package mypack;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		for(int i=1;i<=N;i++) {
			if(i%3==0 && !(i%5==0)) {
				System.out.println("Fizz");
			}
			if(i%5==0 && !(i%3==0)) {
				System.out.println("Buzz");
			}
			if(i%15==0) {
				System.out.println("FizzBuzz");
			}
			if(!(i%3==0) && !(i%5==0) && !(i%15==0)){
				System.out.println(i+"");
			}
		}
		
		
	}

}
