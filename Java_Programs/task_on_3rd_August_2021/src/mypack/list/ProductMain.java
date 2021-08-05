package mypack.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product(101, "Mobile", 21000.00d, 4.5f, 2));
		productList.add(new Product(152, "TV", 245650.00d, 3.7f, 2));
		productList.add(new Product(107, "Fridge", 45000.00d, 4.0f, 1));
		productList.add(new Product(450, "AC", 450300.00d, 3.8f, 3));
		productList.add(new Product(251, "Laptop", 150000.00d, 4.5f, 2));
		productList.add(new Product(845, "Washing Machine", 80000.00d, 4.0f, 1));
		
		printProductList(productList);
		
		Collections.sort(productList);
		System.out.println("\nProduct sorted based on Id");
		printProductList(productList);
		
		Collections.sort(productList, new ProductNameComparator());
		System.out.println("\nProduct sorted based on Name");
		printProductList(productList);
		
		System.out.println("\nProduct sorted based on Price(High - Low)");
		Collections.sort(productList, (o1, o2)->{
			Double d1 = o1.getCost();
			Double d2 = o2.getCost();
			return d2.compareTo(d1);
		});
		printProductList(productList);
		
		System.out.println("\nProduct sorted based on Ratings and Price");
		Collections.sort(productList, (o1, o2)->{
			Float f1 = o1.getRating();
			Float f2 = o2.getRating();
			int value = f1.compareTo(f2); 
			if(value == 0) {
				Double d1 = o1.getCost();
				Double d2 = o2.getCost();
				value =  d1.compareTo(d2);
			}
			return value;
				
		});
		printProductList(productList);
		
		
	}
	
	public static void printProductList(List<Product> productList) {
		for (Product product : productList) {
			System.out.println(product);
		}
	}

}
