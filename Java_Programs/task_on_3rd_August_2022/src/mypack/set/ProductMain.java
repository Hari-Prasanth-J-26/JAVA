package mypack.set;

import java.util.HashSet;
import java.util.Set;



public class ProductMain {

	public static void main(String[] args) {

		Set<Product> productSet = new HashSet<>();
		productSet.add(new Product(101, "Mobile", 21000.00d, 4.5f, 2));
		productSet.add(new Product(152, "TV", 245650.00d, 3.7f, 2));
		productSet.add(new Product(107, "Fridge", 45000.00d, 4.0f, 1));
		productSet.add(new Product(450, "AC", 450300.00d, 3.8f, 3));
		productSet.add(new Product(251, "Laptop", 150000.00d, 4.5f, 2));
		productSet.add(new Product(845, "Washing Machine", 80000.00d, 4.0f, 1));
		productSet.add(new Product(101, "Mobile", 21000.00d, 4.5f, 2));
		productSet.add(new Product(152, "TV", 245650.00d, 3.7f, 2));
		productSet.add(new Product(107, "Fridge", 45000.00d, 4.0f, 1));
		productSet.add(new Product(450, "AC", 450300.00d, 3.8f, 3));
		productSet.add(new Product(251, "Laptop", 150000.00d, 4.5f, 2));
		productSet.add(new Product(845, "Washing Machine", 80000.00d, 4.0f, 1));
		
		printProductList(productSet);
		
		
	}
	
	public static void printProductList(Set<Product> productSet) {
		for (Product product : productSet) {
			System.out.println(product);
		}
	}

}
