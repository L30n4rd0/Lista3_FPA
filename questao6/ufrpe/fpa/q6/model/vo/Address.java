/**
 * 
 */
package ufrpe.fpa.q6.model.vo;

/**
 * @author leonardo
 *
 */
public class Address {
	private String country, state, city, street, neighborhood;
	private int number;

	/**
	 * @param country
	 * @param state
	 * @param city
	 * @param street
	 * @param neighborhood
	 * @param number
	 */
	public Address(String country, String state, String city, String street, String neighborhood, int number) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.street = street;
		this.neighborhood = neighborhood;
		this.number = number;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return the neighborhood
	 */
	public String getNeighborhood() {
		return neighborhood;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "\nRua " + this.street + ", " + this.number + "." + 
				"\nBairro: " + this.neighborhood + ", " + 
				this.city + ", " + 
				this.state + ", " + 
				this.country;
		
	}
	
}
