/**
 * 
 */
package ufrpe.fpa.q4;

/**
 * @author leonardo
 *
 */
public class Bicycle implements CarbonFootprint {
	protected static final String RACING_BICYCLE = "Racing", NORMAL_BICYCLE = "Normal";
	private float weight;
	private String category;
	
	/**
	 * @param weight
	 * @param category
	 */
	public Bicycle(float weight, String category) {
		super();
		this.weight = weight;
		this.category = category;
	}
	
	/* (non-Javadoc)
	 * @see ufrpe.fpa.questao4.CarbonFootprint#getCarbonFootprint()
	 */
	@Override
	public float getCarbonFootprint() {
		
		if (this.category.equals(Bicycle.NORMAL_BICYCLE))
			return this.weight * 100;
		
		else
			return this.weight * 200;
		
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
}
