package com.bridgelabz.book;

import java.util.ArrayList;
import java.util.Date;

public class MainBook {

	ArrayList<Book> books = new ArrayList<>();

	public void loadBooks() {

		Book book1 = new Book("Rich Dad Poor Dad", "Shubham", 2000, new Date());
		Book book2 = new Book("Java Basics", "Varad", 1000, new Date());
		Book book3 = new Book("Java Basics", "Varad", 1000, new Date());
		Book book4 = new Book("Linux Basics", "Piyush", 1500, new Date());
		Book book5 = new Book("Java Basics", "Varad", 1800, new Date());

		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
	}

	public void calculateTotal() {
		int totals = 0;
		for (Book book : books) {
			totals += book.getPrice();
		}

		System.out.println(totals);
	}

	public void storeNames() {
		String[] bookNames = new String[5];
		for (int i = 0; i < books.size(); i++) {
//			bookNames[i] = books.get(i).getBookName();
			Book book = books.get(i);
			bookNames[i] = book.getBookName();
		}

		for (String bName : bookNames) {
			System.out.println(bName);
		}
	}
	
	public void reverseNames() {
		
		for (int i = books.size() - 1; i >= 0; i--) {
			System.out.println(books.get(i).getBookName());
		}
	}

	public static void main(String[] args) {

		MainBook mainBook = new MainBook();
		mainBook.loadBooks();

		mainBook.calculateTotal();
		mainBook.storeNames();
		mainBook.reverseNames();
		/*
		 * Book book1 = new Book("Rich Dad Poor Dad", "Shubham", 2000, new Date()); Book
		 * book2 = new Book("Java Basics", "Varad", 1000, new Date()); Book book3 = new
		 * Book("Java Basics", "Varad", 1000, new Date()); Book book4 = new
		 * Book("Linux Basics", "Piyush", 1500, new Date()); Book book5 = new
		 * Book("Java Basics", "Varad", 1800, new Date());
		 */

		/*
		 * System.out.println(book1); System.out.println(book2);
		 * System.out.println(book3); System.out.println(book4);
		 * System.out.println(book5);
		 */

		/*
		 * System.out.println(reverseString(book1.bookName));
		 * System.out.println(reverseString(book2.bookName));
		 * System.out.println(reverseString(book3.bookName));
		 * System.out.println(reverseString(book4.bookName));
		 * System.out.println(reverseString(book5.bookName));
		 */
	}

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
}
