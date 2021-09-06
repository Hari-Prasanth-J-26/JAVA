package mypack;

public class UserMainCode {
	
	public static int validateColorCode(String input) {
		int result = 0;
		if(input.matches("[#]{1}[A-Z0-9]{6}")){
			result = 1;
		}
		else {
			result = -1;
		}
		return result;
	}


}
