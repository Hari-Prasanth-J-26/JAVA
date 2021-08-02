package mypack.inheritance;


public class Area {
	
	public static void main(String[] args) {
		Trapezium t  = new Trapezium();
		System.out.println("Area of Square : "+t.area(5));
		System.out.println("Area of Rectangle : "+t.area(5, 8));
		System.out.println("Area of Trapezium : "+t.area(5, 8, 10));
	}

}
