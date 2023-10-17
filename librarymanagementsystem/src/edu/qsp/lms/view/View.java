package edu.qsp.lms.view;

import java.util.Scanner;

import edu.qsp.lms.controller.LibraryController;
import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class View {
	static Scanner myInput = new Scanner(System.in);
	static LibraryController controller = new LibraryController();
	static Library library = new Library();

	static {
		System.out.println("-----------------------------------------------");
		System.out.println("|    Wellcome to Library Management System    |");
		System.out.println("-----------------------------------------------");
		System.out.println();
		

		System.out.print("Enter Name of Library : ");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		System.out.print("Enter Address of Library : ");
		String libraryAddress = myInput.nextLine();
		library.setLibraryAddress(libraryAddress);
		System.out.print("Enter Pincode : ");
		int libraryPincode = myInput.nextInt();
		myInput.nextLine();
		library.setLibraryPincode(libraryPincode);
	}

	public static void main(String[] args) {
		do {
			System.out.println();
			System.out.println("----------------------------------------");
			System.out.println("|      Select operation to perform :   |");
			System.out.println("----------------------------------------");
			System.out.println();

			
			System.out.println(
					"1.Add Book\n2.Remove Book\n3.Update Book\n4.Get Book By Book Name\n5.Get All Books\n0.Exit");
			System.out.println();
			System.out.print("Enter digit respective to desired option : ");
			int userChoice = myInput.nextInt();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("---Exited---");
				System.exit(0);
				break;
			case 1:
				
				
				System.out.println();
				System.out.println("----------------------------------------");
				System.out.println("|           Add a New Book             |");
				System.out.println("----------------------------------------");
				System.out.println();
				
				
				Book book1 = new Book();
				System.out.print("Enter Book Name : ");
				book1.setBookName(myInput.nextLine());
				System.out.print("Enter Author Name : ");
				book1.setBookAuthor(myInput.nextLine());
				System.out.print("Enter Price of Books : ");
				book1.setPrice(myInput.nextDouble());
				myInput.nextLine();
				System.out.print("Enter Publicatoion : ");
				book1.setPublication(myInput.nextLine());
				
				controller.addBook(book1);
				break;
			case 2:
				System.out.println();
				System.out.println("------------------------------------------------");
				System.out.println("|                 Remove a Book                |");
				System.out.println("------------------------------------------------");
				System.out.println();
				
				
				System.out.print(" Enter Name Of the book to be Removed : ");
				String bookToBeRemoved = myInput.nextLine();
				boolean verify = controller.removeBooksByBookName(bookToBeRemoved);
				//
				if (verify) {
					System.out.println("Book removed from Library");
				}else {
					System.out.println("Book does not exist in library");
				}
				//
				
				break;
			case 3:
				Book book3 = new Book();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("|         Update Book Price           |");
				System.out.println("---------------------------------------");
				System.out.println();
				
				System.out.print("Enter Name of book to Update : ");
				String bookToUpdate = myInput.nextLine();
				book3.setBookName(bookToUpdate);
				System.out.print("Enter price to Update:  ");
				double newPrice = myInput.nextDouble();
				book3.setPrice(newPrice);
				boolean verifyUpdate = controller.updateBookPriceByBookName(book3);
				if (verifyUpdate) {
					System.out.println("Price Updated");
				}else {
					System.out.println("Mentioned Book does not exist in Library");
				}
				break;
			case 4:
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("|         Search for a Book           |");
				System.out.println("---------------------------------------");
				System.out.println();
				
				System.out.print(" Enter Name of Book : ");
				String bookToGet = myInput.nextLine();
				System.out.println();
				//
				Book book4 = controller.searchBooks(bookToGet);
				if (book4!=null) {
					System.out.println(book4);
				}else {
					System.out.println("Book Not Found");
				}
				break;
			case 5:
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("|    List of Books in the Library     |");
				System.out.println("---------------------------------------");
				System.out.println();
				
				System.out.println(controller.getAllBooks());
				break;
			default:
				System.out.println("---Invalid Selection---");
				break;
			}
		} while (true);
	}
}
