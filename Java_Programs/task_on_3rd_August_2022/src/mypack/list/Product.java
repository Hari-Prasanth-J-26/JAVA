package mypack.list;

public class Product implements Comparable<Product>{
	
	private int id;
	private String name;
	private double cost;
	private float rating;
	private int quantity;
	
	public Product() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Product(int id, String name, double cost, float rating, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", rating=" + rating + ", quantity="
				+ quantity + "]";
	}
	@Override
	public int compareTo(Product o) {
		Integer i1 = this.getId();
		Integer i2 = o.getId();
		return i1.compareTo(i2);
	}
	
	

}
