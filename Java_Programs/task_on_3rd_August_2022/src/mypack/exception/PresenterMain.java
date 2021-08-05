package mypack.exception;

public class PresenterMain {

	public static void main(String[] args) {

		BusinessValidation b = new BusinessValidation();
		String aadhar = "95214687945";
		try {
			if(b.isValidAadhar(aadhar))
				System.out.println("Your Aadhar number is valid");
		}catch(InvalidAadharException e) {
			System.out.println(e.getMessage());
		}

	}

}
