package mypack.exception;

public class PresenterChecked {

	public static void main(String[] args) {

		BusinessChecked b = new BusinessChecked();
		int[] arr = {1, 2, 3, 4};
		try {
			b.readValue(arr);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
	}

}
