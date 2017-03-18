package pkgLibrary;

public class BookException extends Exception {
	
	private Catalog catalog;
	private Book book;
	private String BookID;
	
	//this section is where exceptions are sent and caught
	
	public BookException(Catalog catolog, Book book) {
		super();
		this.book = book;
		this.catalog = catalog;
	}
	
	
	public BookException(Catalog catalog, String bookID) {
		super();
		this.catalog = catalog;
		BookID = bookID;
	}


	
	
	public Book getBook() {
		return book;
	}
	
	public Catalog getCat() {
		return catalog;
	}
	
	public String getBookID() {
		return BookID;
	}

}
