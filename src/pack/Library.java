package pack;

public class Library {
	
	public Library() {
		
	}

	public Library(Book book) {
		
	}
		
	public void bookDetails(Book book) {
		System.out.println(book.title + " " + book.id);
	}
	
	public static void main(String[] args) {
		Book book = new Book("arry po'oh", 1);
		Library lib = new Library();
		
		lib.bookDetails(book);
		System.out.println(book.showTitle(book));
	}

}
