package Iterator;
import java.util.ArrayList;


public class BookShelf implements Aggregate {
	private ArrayList arrayBooks;
	private Book[] books;
	private int last = 0;
	private boolean isArray;
	
	public BookShelf(int maxsize, boolean isArray ) {
		if(isArray) {
			this.isArray = isArray;
			this.arrayBooks = new ArrayList(maxsize);
		} else {
			this.books = new Book[maxsize];
		}
		
	}
	
	public Book getBookAt(int index) {
		if(isArray) {
			return (Book)arrayBooks.get(index);
		}
		return books[index];
	}
	
	public void appendBook(Book book) {
		if(isArray) {
			arrayBooks.add(book);
		} else {
			this.books[last] = book;
			last++;
		}
	}
	
	public int getLength() {
		if(isArray) {
			return arrayBooks.size();
		}
		return last;
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return (Iterator) new BookShelfIterator(this);
	}
	
	
}
