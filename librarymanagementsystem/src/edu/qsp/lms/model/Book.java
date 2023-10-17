package edu.qsp.lms.model;

public class Book {
	
	//Attributes for Books
	
	private String bookName;
	private String bookAuthor;
	private double price;
	private String publication;
	
	//Getter and Setter
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	

	@Override
	public String toString() {
		return "\nBook [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price=" + price + ", publication="
				+ publication + "]";
	}
	
}
