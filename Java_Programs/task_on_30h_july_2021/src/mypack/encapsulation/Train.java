package mypack.encapsulation;

public class Train {
	private int serialNo;
	private String code;
	private String station;
	private String arrivalTime;
	private String departureTime;
	
	public Train() {
		
	}
	
	public Train(int serialNo, String code, String station, String arrivalTime, String departureTime) {
		super();
		this.serialNo = serialNo;
		this.code = code;
		this.station = station;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}



	public void print1() {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)");
		System.out.println("--------------------------------------");
		System.out.println("#  Code  Station          Arr.   Dep.");
		System.out.println("--------------------------------------");
		
	}
	
	public void printDetails() {
		System.out.printf("%d  %-3s   %-15s %6s %6s\n",serialNo, code.trim(), station.trim(), arrivalTime, departureTime);
	}
	
	public void print2() {
		System.out.println("--------------------------------------");
	}
	
}
