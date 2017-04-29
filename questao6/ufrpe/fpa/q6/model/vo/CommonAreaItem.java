/**
 * 
 */
package ufrpe.fpa.q6.model.vo;

/**
 * @author leonardo
 *
 */
public class CommonAreaItem {
	private String type, description;

	/**
	 * @param type
	 * @param description
	 */
	public CommonAreaItem(String type, String description) {
		super();
		this.type = type;
		this.description = description;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "Tipo: " + this.type +
				"\nDescrição: " + this.description;
		
	}
	
	

}
