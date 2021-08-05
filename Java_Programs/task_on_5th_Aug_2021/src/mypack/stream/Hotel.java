package mypack.stream;
import java.util.*;

public class Hotel {

	private int serialNo;
	private String food;
	private double price;
	private int quantity;
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Hotel() {
		
	}
	
	public Hotel(int serialNo, String food, double price, int quantity) {
		super();
		this.serialNo = serialNo;
		this.food = food;
		this.price = price;
		this.quantity = quantity;
		
	}
	@Override
	public String toString() {
		return "Hotel [serialNo=" + serialNo + ", food=" + food + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
