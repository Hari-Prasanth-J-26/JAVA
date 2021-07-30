package mypack;

public class Problem3 {

	public static boolean isPalindrome(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}
	
	public static void main(String[] args) {
		String s = "mom and dad are waiting to see your madam";
		StringBuilder sb = new StringBuilder();
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(isPalindrome(arr[i]))
				sb.append(arr[i]).append(" ");
			else 
				sb.append(new StringBuilder(arr[i]).reverse()).append(" ");
		}
		System.out.println(sb);
		
	}

}
