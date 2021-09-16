package com.bridgelabz.book;

import java.util.Date;

public class Book {
	String bookName;
	String authorName;
	int price;
	Date dateOfIssue;
	
	public Book(String bookName, String authorName, int price, Date dateOfIssues) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.dateOfIssue = dateOfIssues;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + ", dateOfIssue="
				+ dateOfIssue + "]";
	}

	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Date getDateOfIssues() {
		return dateOfIssue;
	}
	
	public void setDateOfIssues(Date dateOfIssues) {
		this.dateOfIssue = dateOfIssues;
	}
}
