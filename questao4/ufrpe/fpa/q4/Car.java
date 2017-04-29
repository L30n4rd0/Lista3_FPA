/**
 * 
 */
package ufrpe.fpa.q4;

/**
 * @author leonardo
 *
 */
public class Car implements CarbonFootprint {
	protected static final String FUEL_GASOLINE = "Gasoline", FUEL_DIESEL = "Diesel", FUEL_ALCOHOL = "Alcohol";
	private String fuel;
	private float cylinderCapacity;
	private float tankCapacity;
	
	/**
	 * @param fuel
	 * @param cylinderCapacity
	 * @param tankCapacity
	 */
	public Car(String fuel, float cylinderCapacity, float tankCapacity) {
		super();
		this.fuel = fuel;
		this.cylinderCapacity = cylinderCapacity;
		this.tankCapacity = tankCapacity;
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.questao4.CarbonFootprint#getCarbonFootprint()
	 */
	@Override
	public float getCarbonFootprint() {
		float pollutionPercentage = 0f;
		
		/*
		 * Increases pollution percentage by 20% if fuel is alcohol
		 * */
		if (this.fuel.equals(Car.FUEL_ALCOHOL))
			pollutionPercentage = 1.2f;
		
		/*
		 * Increases pollution percentage by 30% if fuel is gasoline
		 * */
		else if (this.fuel.equals(Car.FUEL_GASOLINE))
			pollutionPercentage = 1.3f;
		
		/*
		 * Increases pollution percentage by 40% if fuel is diesel
		 * */
		else if (this.fuel.equals(Car.FUEL_DIESEL))
			pollutionPercentage = 1.4f;
		
		/*
		 * Increases pollution percentage by 10% if is another type of fuel
		 * */
		else
			pollutionPercentage = 1.1f;
		
		return ((this.cylinderCapacity + this.tankCapacity) * 10) * pollutionPercentage;
	}

	/**
	 * @return the fuel
	 */
	public String getFuel() {
		return fuel;
	}

	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	/**
	 * @return the cylinderCapacity
	 */
	public float getCylinderCapacity() {
		return cylinderCapacity;
	}

	/**
	 * @param cylinderCapacity the cylinderCapacity to set
	 */
	public void setCylinderCapacity(float cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	/**
	 * @return the tankCapacity
	 */
	public float getTankCapacity() {
		return tankCapacity;
	}

	/**
	 * @param tankCapacity the tankCapacity to set
	 */
	public void setTankCapacity(float tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	
}
