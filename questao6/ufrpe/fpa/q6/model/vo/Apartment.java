package ufrpe.fpa.q6.model.vo;

public class Apartment {
	private int parkingSpaces, bedroomQuantity, bathroomQuantity, bedroomSuiteQty;
	private double totalArea, price;
	
	/**
	 * @param parkingSpaces
	 * @param bedroomQuantity
	 * @param bathroomQuantity
	 * @param bedroomSuiteQty
	 * @param totalArea
	 * @param price
	 */
	public Apartment(int parkingSpaces, int bedroomQuantity, int bathroomQuantity, int bedroomSuiteQty,
			double totalArea, double price) {
		super();
		this.parkingSpaces = parkingSpaces;
		this.bedroomQuantity = bedroomQuantity;
		this.bathroomQuantity = bathroomQuantity;
		this.bedroomSuiteQty = bedroomSuiteQty;
		this.totalArea = totalArea;
		this.price = price;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @return the parkingSpaces
	 */
	public int getParkingSpaces() {
		return parkingSpaces;
	}
	
	/**
	 * @return the bedroomQuantity
	 */
	public int getBedroomQuantity() {
		return bedroomQuantity;
	}
	
	/**
	 * @return the bathroomQuantity
	 */
	public int getBathroomQuantity() {
		return bathroomQuantity;
	}
	
	/**
	 * @return the bedroomSuiteQty
	 */
	public int getBedroomSuiteQty() {
		return bedroomSuiteQty;
	}
	
	/**
	 * @return the totalArea
	 */
	public double getTotalArea() {
		return totalArea;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "Área total: " + this.totalArea +
				"\nPreço: " + this.price +
				"\nVagas na garagem: " + this.parkingSpaces +
				"\nNúmero de quartos: " + this.bedroomQuantity +
				"\nNúmero de banheiros: " + this.bathroomQuantity +
				"\nNúmero de suites: " + this.bedroomSuiteQty;
		
	}
	
	

}
