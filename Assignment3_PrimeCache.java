/* Assignment 3: Static Initialization
Create a class PrimeCache that:

Has a static List<Integer> primes.

In a static block, pre-compute and fill primes with all prime numbers up to 100.

Provides a static method isPrime(int n) that checks membership in primes.

In main(), test PrimeCache.isPrime(97) and PrimeCache.isPrime(100). */

import java.util.*;

class PrimeCache
{
	// Method to check if a number is prime (used only for initialization)
	public static boolean isPrimeInternal(int num)
	{
		if (num <= 1)
		{
			return false; // Numbers less than or equal to 1 are not prime
		}
		
		else if (num > 2)
		{
			for (int i = 2; i < num; i++)
			{
				if (num % i == 0)
				{
					return false; // If divisible by any number other than 1 and itself, it's not prime
				}
			}
		}
		
		return true; // Number is prime
	}
	
	// Static list to store precomputed prime numbers
	static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	// Static block to initialize the prime list only once when the class is loaded
	static
	{
		for (int i = 2; i <= 100; i++)
		{
			if (isPrimeInternal(i))
			{
				primes.add(i); // Add the prime number to the list
			}
		}
	}
	
	// Public method to check if a number is in the prime list
	public static boolean isPrime(int num)
	{
		return primes.contains(num); // Use contains() to check presence in the list
	}
}

public class Static3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to check primality: ");
		int num = sc.nextInt(); // Read number from user
		
		System.out.println(num + ": " + PrimeCache.isPrime(num)); // Print whether the number is prime
	}
}
