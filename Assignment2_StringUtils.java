/* Assignment 2: Static Utility Class
Design a final class StringUtils with:

A private constructor (to prevent instantiation).

A static method reverse(String s) that returns the reversed string.

A static final constant DEFAULT_DELIMITER = ",".

Demonstrate calling StringUtils.reverse("Java") and printing StringUtils.DEFAULT_DELIMITER from main(). */

import java.util.*;

// Final class so it cannot be extended
final class StringUtils
{
	// Private constructor to prevent instantiation
	private StringUtils()
	{}

	// Static method to reverse a given string
	public static String reverse(String str)
	{
		String newStr = "";

		// Looping through the string from end to start
		for (int i = 1; i <= str.length(); i++)
		{
			// Append characters one by one in reverse order
			newStr += str.charAt(str.length() - i);
		}

		// Return the reversed string
		return newStr;
	}

	// Static final constant (a constant delimiter)
	public static final String DEFAULT_DELIMITER = ",";
}

public class Static2
{
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);

		// Ask user for input
		System.out.print("Enter string: ");
		String str = sc.next();

		// Call the static reverse method and print the result
		System.out.println("Reversed String: " + StringUtils.reverse(str));

		// Access and print the default delimiter constant
		System.out.println(StringUtils.DEFAULT_DELIMITER);
	}
}
