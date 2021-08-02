package mypack.encapsulation;

public class Main {

	public static void main(String[] args) {

		Train[] train = {
				new Train(1, "YPR", "Yasvantpur Jn", "", "23.40"),
				new Train(2, "GTL", "Guntakal Jn", "03.45", "03.50"),
				new Train(3, "SC", "Secundrabad Jn", "08.55", "09.10"),
				new Train(4, "BPQ", "Balharshah", "13.30", "13.35"),
				new Train(5, "HBJ", "Habibganj", "21.20", "21.25"),
				new Train(6, "JHS", "Jhansi Jn", "01.15", "01.20"),
				new Train(7, "DEE", "Delhi & Rohilla", "07.00", ""),
		
		};
		Train statement = new Train();
		statement.print1();
		for(Train trainDetails:train)
			trainDetails.printDetails();
		statement.print2();

	}

}
