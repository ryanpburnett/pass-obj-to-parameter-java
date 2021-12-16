package pack;

public class Book {
	
	public String title;
	public int id;
	
	Book() {
	
	}
	
	Book(String title, int id) {
		this.title = title;
		this.id = id;
	}
	
	public String showTitle(Book book) {
		return book.title;
	}

}
