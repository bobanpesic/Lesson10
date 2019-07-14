package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pattern phoneNumberIsValide;
		Matcher match;
		boolean find;
		
		phoneNumberIsValide = Pattern.compile("0631901981");
		match = phoneNumberIsValide.matcher("0631901981");   
		find = match.matches();

		System.out.println("Phone number is valid?");

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


