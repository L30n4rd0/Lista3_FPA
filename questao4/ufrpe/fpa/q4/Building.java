/**
 * 
 */
package ufrpe.fpa.q4;

/**
 * @author leonardo
 *
 */
public class Building implements CarbonFootprint {
	private int peopleNumber, lampsNumber;
	private boolean renewableEnergy, airConditioning;
	/**
	 * @param peopleNumber
	 * @param lampsNumber
	 * @param renewableEnergy
	 * @param airConditioning
	 */
	
	public Building(int peopleNumber, int lampsNumber, boolean renewableEnergy, boolean airConditioning) {
		super();
		this.peopleNumber = peopleNumber;
		this.lampsNumber = lampsNumber;
		this.renewableEnergy = renewableEnergy;
		this.airConditioning = airConditioning;
	}
	
	/* (non-Javadoc)
	 * @see ufrpe.fpa.questao4.CarbonFootprint#getCarbonFootprint()
	 */
	@Override
	public float getCarbonFootprint() {
		float pollutionPercentage = 1f;
		
		/*
		 * Decreases pollution percentage by 20% if renewable energy is used.
		 * */
		if (this.renewableEnergy)
			pollutionPercentage -= 0.2f;
		
		/*
		 * Decreases pollution percentage by 20% if not air-conditioned..
		 * */
		if (!this.airConditioning)
			pollutionPercentage -= 0.2f;
		
		return ((this.lampsNumber + this.peopleNumber) * 1000) * pollutionPercentage;
	}

	/**
	 * @return the peopleNumber
	 */
	public int getPeopleNumber() {
		return peopleNumber;
	}
	
	/**
	 * @param peopleNumber the peopleNumber to set
	 */
	public void setPeopleNumber(int peopleNumber) {
		this.peopleNumber = peopleNumber;
	}
	
	/**
	 * @return the lampsNumber
	 */
	public int getLampsNumber() {
		return lampsNumber;
	}
	
	/**
	 * @param lampsNumber the lampsNumber to set
	 */
	public void setLampsNumber(int lampsNumber) {
		this.lampsNumber = lampsNumber;
	}
	
	/**
	 * @return the renewableEnergy
	 */
	public boolean isRenewableEnergy() {
		return renewableEnergy;
	}
	
	/**
	 * @param renewableEnergy the renewableEnergy to set
	 */
	public void setRenewableEnergy(boolean renewableEnergy) {
		this.renewableEnergy = renewableEnergy;
	}
	
	/**
	 * @return the airConditioning
	 */
	public boolean isAirConditioning() {
		return airConditioning;
	}
	
	/**
	 * @param airConditioning the airConditioning to set
	 */
	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

}
