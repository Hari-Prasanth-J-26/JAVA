package mypack.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class BillCalculation  {
	
	public void billSheet1() {
		System.out.println("              Hotel Aryas              ");
		System.out.println("----------------------------------------");
		System.out.println("#  Food-Item   Price   Quantity  Total");
		System.out.println("----------------------------------------");
	}
	
	public void billSheet2(double totalAmount, double withGST) {
		System.out.println("----------------------------------------");
		System.out.printf("Total Amount                    %6.2f",totalAmount);
		System.out.printf("\nTax : GST                        %6.2f",withGST);
		System.out.println("\n----------------------------------------");
		System.out.printf("Bill Amount                     %6.2f",totalAmount+withGST);
		
		
	}
	
	public void print(int i, Hotel foodList) {
		System.out.printf("%d  %-7s %9.2f %6d %11.2f\n", i, foodList.getFood(), foodList.getPrice(), foodList.getQuantity(), foodList.getPrice()*foodList.getQuantity());
	}
	
	public void billStatement(List<Hotel> foodList) {
		billSheet1();
		int i = 1;
		for (Hotel food : foodList) {
			print(i++, food);
		}
		double totalAmount = foodList.stream()
				.map(e -> e.getPrice()*e.getQuantity())
				.reduce(Double.MIN_VALUE, (sum, element) -> sum + element);
		double withGST = totalAmount*0.05;
		//System.out.println(withGST);
		billSheet2(totalAmount, withGST);
		
	}

	public static void main(String[] args) {

		List<Hotel> foodList = new ArrayList<>();
		foodList.add(new Hotel(1, "Chicken", 70.50, 3));
		foodList.add(new Hotel(2, "Idly", 15.00, 5));
		foodList.add(new Hotel(3, "Omblet", 20.50, 2));
		foodList.add(new Hotel(4, "Noodles", 80.10, 4));
		foodList.add(new Hotel(5, "Parotta", 15.00, 7));
		foodList.add(new Hotel(6, "Sambar", 95.40, 2));
		foodList.add(new Hotel(7, "Dosa", 25.20, 6));
		
		Collections.sort(foodList, (o1, o2) ->{
			String s1 = o1.getFood();
			String s2 = o2.getFood();
			return s1.compareTo(s2);
		});
		System.out.println();
		
		BillCalculation food = new BillCalculation();
		food.billStatement(foodList);

	}

}
