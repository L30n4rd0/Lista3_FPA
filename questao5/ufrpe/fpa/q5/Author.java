/**
 * 
 */
package ufrpe.fpa.q5;

/**
 * @author leonardo
 *
 */
public class Author {
	private String name, email;
	private char gender;
	
	/**
	 * @param name
	 * @param email
	 * @param gender
	 */
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nome: " + this.name + "\nEmail: " + this.email + "\nGênero: " + this.gender;
	}

}
