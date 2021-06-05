package automation.homeworkBook;

public class Author {

	public String name;
	public String email;

	/**
	 * Constructor - object Author that defines the author of the book
	 * 
	 * @param name
	 * @param email
	 * 
	 */

	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * @param name
	 *        Name of the author
	 * @return returns the value of the @param author
	 */
	public String getName(String name) {
		return name;
	}

	/**
	 * @param email
	 *        The email of the author
	 * @return Returns the value of @param email
	 */
	public String getEmail(String email) {
		return email;
	}

}