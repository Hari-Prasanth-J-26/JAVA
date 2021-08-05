package mypack.exception;

public class BusinessValidation {

	public boolean isValidAadhar(String aadhar) throws InvalidAadharException{
		if(aadhar != null && aadhar.matches("[0-9]{12}"))
			return true;
		else
			throw new InvalidAadharException("Your Aadhar number "+aadhar+" is not valid");
	}
	
}
