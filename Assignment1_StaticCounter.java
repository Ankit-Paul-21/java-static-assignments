/* Assignment 1: Static Counter
Create a class Book with a non-static field title and a static field libraryCount.

In Book’s constructor, increment libraryCount.

Write a static method getLibraryCount() to return how many Book objects have been created.

In main(), create several Book instances and print out the count. */

import java.util.*;

class Book
{
	public String title;                    // Each book has its own title
	
	public static int libraryCount = 0;     // Shared count across all books
	
	Book(String str)
	{
		title = str;
		libraryCount++;                     // Increment total count whenever a book is created
	}
	
	public static int getLibraryCount()
	{
		return libraryCount;               // Return total book objects created
	}
}

public class Static1
{
	public static void main(String[] args)
	{
		Book book1 = new Book("Harry Potter");
		Book book2 = new Book("Percy Jackson");
		Book book3 = new Book("The Iliad");
		Book book4 = new Book("The Odyssey");
		
		System.out.println("Total books created: " + Book.getLibraryCount());
	}
}
