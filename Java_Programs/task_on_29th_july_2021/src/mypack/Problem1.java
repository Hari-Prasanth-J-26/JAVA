package mypack;

public class Problem1 {
	
	public static String convertLastLetterUpperInEachWord(String s) {
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i].substring(0, arr[i].length()-1)).append(Character.toUpperCase(arr[i].charAt(arr[i].length()-1))).append(" ");
		}
		return sb.toString();
 	}

	public static void main(String[] args) {
		
		String s="hello hi good noon hope we got thread safety";
		System.out.println(convertLastLetterUpperInEachWord(s));

	}
	
}
