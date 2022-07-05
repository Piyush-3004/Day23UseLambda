package LambdaValidation;
import java.util.function.*;
import java.util.regex.Pattern;
public class LambdaValidation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub`
		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
		
		Predicate<String> validate = (firstName) -> Pattern.compile(firstNameRegex).matcher(firstName).matches();
		
		System.out.println(validate.test("Piyush"));
		
		Predicate<String> validateLastName = (lastName) -> Pattern.compile(firstNameRegex).matcher(lastName).matches();
		
		System.out.println(validateLastName.test("Patil"));
		
		String validEmail = "^[a-z0-9]+(@)[a-z]+(.)[a-z]+$";
		
		Predicate<String> validateEmail = (email)-> Pattern.compile(validEmail).matcher(email).matches();
		
		System.out.println(validateEmail.test("p1yushp04@gmail.com"));
		
		String validMobile = "^[7-9]{1}[0-9]{9}$";
		
		Predicate<String> validateMobile = (number)->Pattern.compile(validMobile).matcher(number).matches();
		
		System.out.println(validateMobile.test("9011557471"));
		
		
		String validPassword = "[a-zA-Z0-9[!@#&*]]+";
		
		Predicate<String> validatePassword = (password)->Pattern.compile(validPassword).matcher(password).matches();
		
		System.out.println(validatePassword.test("Rocky@@123"));

	}

}
