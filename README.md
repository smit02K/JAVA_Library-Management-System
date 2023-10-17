# Library Management System

This Java project is a simple Library Management System (LMS) that follows the MVC (Model-View-Controller) architectural pattern. The project allows users to manage books in a library by performing operations like adding, removing, updating, and searching for books.

## Project Overview

The Library Management System is designed to provide a platform for librarians to manage the books in a library. It allows users to perform various operations, such as adding new books, removing books, updating book prices, searching for books by name, and retrieving a list of all available books.

## Project Structure

The project is organized into three main packages: `model`, `view`, and `controller`. Each package contains classes with specific responsibilities:

### Controller Package (`edu.qsp.lms.controller`)

- **LibraryController.java:** This class serves as the controller in the MVC pattern. It contains methods for adding books, retrieving all books, searching for books, removing books by name, and updating book prices. It interacts with the model and view components to perform these operations.

### Model Package (`edu.qsp.lms.model`)

- **Book.java:** The `Book` class defines the attributes of a book, such as name, author, price, and publication. It includes getters and setters for these attributes.
- **Library.java:** The `Library` class represents a library and includes attributes like name, address, pincode, and a list of books. It also has getters and setters for these attributes.

### View Package (`edu.qsp.lms.view`)

- **View.java:** The `View` class serves as the user interface for the Library Management System. It allows users to interact with the system by providing a command-line interface. Users can add, remove, update, search for, and list books.

## User Interface (UI)

The presented user interface (UI) demonstrates the interaction with this Library Management System. Here's a description of the flow and functionalities provided by the UI:

1. **Welcome Screen:** The UI starts with a welcome message, prompting the user to input the name of the library, its address, and pin code. This sets up the library's details.

    ![Figure 1: Welcome Screen](https://github.com/smit02K/JAVA_Library-Management-System/assets/63186967/49ff3056-1929-46b5-b24f-ff1223116966)

3. **Main Menu:** After library details are entered, the main menu is displayed. The user can select various operations from this menu, such as adding a book, removing a book, updating a book's price, searching for a book, listing all books, or exiting the system. The user inputs their choice by entering a numeric value.

   ![Figure 2: Main Menu](link-to-image-2.png)

4. **Add Book Operation:** If the user chooses to add a book, the UI provides a form-like interface to input the book's details, including title, author, price, and publication. Once entered, the book is added to the library.

   ![Figure 3: Add Book Operation](link-to-image-3.png)

5. **Remove Book Operation:** When the user selects the option to remove a book, they are prompted to enter the title of the book to be removed. The system then removes the book if it exists in the library and confirms its removal.

   ![Figure 4: Remove Book Operation](link-to-image-4.png)

6. **Update Book Price Operation:** To update a book's price, the user provides the title of the book they wish to update and the new price. The UI then informs the user of the successful price update.

   ![Figure 5: Update Book Price Operation](link-to-image-5.png)

7. **Search Book Operation:** The user can search for a book by entering its title. If found, the UI displays the book's details.

   ![Figure 6: Search Book Operation](link-to-image-6.png)

8. **List All Books Operation:** Choosing this option lists all the books in the library along with their details.

   ![Figure 7: List All Books Operation](link-to-image-7.png)

9. **Exiting the System:** Finally, the user can choose to exit the system, which closes the program and displays an exit message.

   ![Figure 8: Exiting the System](link-to-image-8.png)

## Project Execution

- The project starts with the user providing information about the library, including its name, address, and pincode.
- Users are presented with a menu to select the desired operation.
- The available operations include adding a book, removing a book by name, updating the price of a book by name, searching for a book by name, and listing all available books.
- Users can interact with the system by entering their choice and providing relevant information for each operation.

## Project Features

- Add books to the library.
- Remove books from the library by name.
- Update the price of a book by name.
- Search for a book by name.
- List all available books in the library.

## Enhancements

- This project can be further enhanced by adding features such as user authentication, borrowing and returning books, and generating reports.

## Conclusion

The Library Management System is a basic implementation of a library management application following the MVC architectural pattern. It provides essential functionality for managing books in a library. It can be expanded and improved to meet the specific requirements of a real-world library management system.

Author: [Smit Kalathiya]

![Library Management System](link-to-image-if-available.png)

## Video Demo

[![Watch the Video Demo](link-to-video-thumbnail.png)](link-to-video)

```

Replace `[Your Name]`, `[link-to-image-1.png]`, `[link-to-image-2.png]`, and so on with the appropriate information and file paths. Also, replace `[link-to-video-thumbnail.png]` and `[link-to-video]` with the thumbnail and URL for your video demo.
