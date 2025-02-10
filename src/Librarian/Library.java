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
		
	}

	public void borrowBook(Borrower borrower, Book book) {
		if(books.contains(book)) {
			books.remove(book);
			borrower.borrowBook(book);
			System.out.println(borrower.getName() + " borrowed Books: " + book.getTitle());
		}
		else {
			System.out.println("Buku tidak tersedia");
		}
		
	}

	public void returnBook(Borrower borrower, Book book) {
		borrower.returnBook (book);
		books.add(book);
		System.out.println(borrower.getName() + " mengembalikan buku" + book.getTitle());
		
	}

	public void displayLibraryBooks() {
		for(Book book: books) {
			book.displayBookInfo();
		}
			
		
	}

}
