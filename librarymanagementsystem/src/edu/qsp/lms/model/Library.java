package edu.qsp.lms.model;
import java.util.List;

public class Library {
	private String libraryName;
	private String libraryAddress;
	private int libraryPincode;
	private List<Book> books;
	
	//Getters and Setters
	
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public int getLibraryPincode() {
		return libraryPincode;
	}
	public void setLibraryPincode(int libraryPincode) {
		this.libraryPincode = libraryPincode;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", libraryAddress=" + libraryAddress + ", libraryPincode="
				+ libraryPincode + ", books=" + books + "]";
	}
	
	
	
}
