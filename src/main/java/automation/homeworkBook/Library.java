package automation.homeworkBook;

/**
 * Class in charge with displaying the book's and author's details
 * 
 * @author Ionut
 *
 */

public class Library {

	public static void main(String[] args) {

		Author author = new Author("Eliade", "yahoo.com");

		Book book = new Book("Eliade", 1956, author, 120);

		// System.out.println("Book " + book.getName() + " (price is " + book.getPrice() + " RON), by " + book.getAuthor().getName(author)
		// + ", published in " + book.getYear());
	}

}