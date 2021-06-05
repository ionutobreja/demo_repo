package automation.homeworkBook;

/**
 * @author Ionut Class in charge with updating and returning the parameters of the book
 */
public class Book {

	public String name;
	public int year;
	public Author author;
	public double price;

	/**
	 * @param name
	 *        The name of the book
	 * @param year
	 *        The year the book was published
	 * @param author
	 *        The author of the book
	 * @param price
	 *        The price of the book on sale
	 */

	public Book(String name, int year, Author author, double price) {
		this.name = name;
		this.year = year;
		this.author = author;
		this.price = price;
	}

	/**
	 * @param name
	 *        The name of the book
	 * @return Returns the value of @param name
	 */
	public String getName(String name) {
		return name;
	}

	/**
	 * @param author
	 *        The author of the book
	 * @return Returns the value of @param author
	 */
	public Author getAuthor(Author author) {
		return author;
	}

	/**
	 * @param price
	 *        The price of the book on sale
	 * @return Returns the value of @param price
	 */
	public double getPrice(double price) {
		return price;
	}

	/**
	 * @param year
	 *        The year the book was published
	 * @return Returns the value of @param year
	 */
	public int getYear(int year) {
		return year;
	}

	/**
	 * Method that prints details like the name, the price, the author and the year of the book
	 * 
	 * @param author
	 */

}
