package com.prowings.inheritance.composition;

import java.util.ArrayList;
import java.util.List;

public class TestComposition {

	public static void main(String[] args) {

		Book b1 = new Book(" Effective Java ", " Joshoue Bloushe ");
		Book b2 = new Book(" Thinking in Java ", "Bruce Eckel ");
		Book b3 = new Book(" Jva:The Complete Reference Book ", "Herbert Schildt");

		List<Book> books = new ArrayList<Book>();

		books.add(b1);
		books.add(b2);
		books.add(b3);

		Library lab = new Library(books);
		List<Book> books1 = lab.getTotalBooksinLibrary();

		for (Book bk : books1) {
			System.out.println("Title :" + bk.title + "\nAuthor :" + bk.author);

		}

	}

}
