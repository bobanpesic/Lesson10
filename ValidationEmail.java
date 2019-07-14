package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Pattern emailIsValid;
		Matcher match;
		boolean find;

		emailIsValid = Pattern.compile("boban81@gmail.com");
		match = emailIsValid.matcher("gmail@boban81.com");   
		find = match.matches();

		System.out.println("E-mail adress is valide?");

		if (find)

		{

			System.out.println("Yes");

		}

		else

		{

			System.out.println("No");

		}

	}
}
