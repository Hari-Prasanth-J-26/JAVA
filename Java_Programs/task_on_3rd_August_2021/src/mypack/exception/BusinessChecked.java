package mypack.exception;



public class BusinessChecked {

	public void readValue(int[] arr)throws ArrayIndexOutOfBoundsException {
		
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}


	}
}
