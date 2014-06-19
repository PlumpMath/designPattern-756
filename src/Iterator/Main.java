package Iterator;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf = new BookShelf(4, true);
		bookShelf.appendBook(new Book("Around world in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("The power of Love"));
		bookShelf.appendBook(new Book("bumzikiworld"));
		bookShelf.appendBook(new Book("Around world in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("The power of Love"));
		bookShelf.appendBook(new Book("bumzikiworld"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
