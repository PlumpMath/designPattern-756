package Iterator;
/**
 * Iterator 패턴이란, 무엇인가 많이 모여있는 것들을 순서대로 지정하면서 전체를 검색하는 처리를 실행하기 위한 것. 
 * @author skplanet
 *
 */
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
