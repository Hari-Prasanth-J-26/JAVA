package mypack;

public class Main {
	
	public static String printHighestWord(String input) {
		
		StringBuilder sb = new StringBuilder();
		String[] str = input.split(" ");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < str.length; i++) {
			int len = str[i].length();
			if(len > max)
				max = len;
		}
		
		for (int j = 0; j < str.length; j++) {
			int size = str[j].length();
			if(size == max)
				sb.append(str[j]).append(" ");
				
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {

		String s = "hello hi how are you doing";
		System.out.println(printHighestWord(s));
		

	}

}
