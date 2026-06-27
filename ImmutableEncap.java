package revison2;


class Book{
	
	private String title;
	
	public Book(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
}	
public class ImmutableEncap {

	public static void main(String[] args) {
		Book b = new Book("Harry Potter");
		
		System.out.println(b.getTitle());
		
	}

}
