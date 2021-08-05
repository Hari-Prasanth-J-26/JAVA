package mypack.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class StreamMethods {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
		
		boolean result = busList.stream().anyMatch(e->e.getProviderName().matches("Xyz Travels"));
        System.out.println(result);
 
        result = busList.stream().allMatch(e->e.getRating() >= 2.3f);
        System.out.println(result);
 
        result = busList.stream().noneMatch(e->e.getCost() < 900.22);
        System.out.println(result);
        
        System.out.println("\nUnique elements in the list");
        
        list.stream().distinct().forEach(System.out::println);



	}

}
