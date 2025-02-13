package Librarian;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books;
	
	public Library() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added to library: " + book.getTitle());
		
	}

	public void borrowBook(Borrower borrower, Book book) {
		if(books.contains(book)) {
			books.remove(book);
			borrower.borrowBook(book);
//			System.out.println("Book added to library: " + book.getTitle());
			System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
		}
		else {
			System.out.println("Buku tidak tersedia");
		}
		
	}

	public void returnBook(Borrower borrower, Book book) {
		borrower.returnBook (book);
		books.add(book);
		System.out.println(borrower.getName() + " returned " + book.getTitle());
		
	}

	public void displayLibraryBooks() {
		for(Book book: books) {
			System.out.println("Books in library: ");
			book.displayBookInfo();
		}
			
		
	}

}
