package mypack;

public class Problem2 {

	public static void main(String[] args) {
		String s = "hello and hi good noon hope we got thread safety";
		StringBuilder sb = new StringBuilder();
		String[] arr=s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()%2==0) 
				sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
			else {
				int mid = arr[i].length()/2;
				sb.append(arr[i].substring(0, mid)).append(Character.toUpperCase(arr[i].charAt(mid))).append(arr[i].substring(mid+1)).append(" ");
			}
		}
		System.out.println(sb);
	}

}
