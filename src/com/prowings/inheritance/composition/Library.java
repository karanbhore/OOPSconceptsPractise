package com.prowings.inheritance.composition;

import java.util.List;

public class Library {

	private final List<Book> books;

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getTotalBooksinLibrary() {
		return books;

	}

}
