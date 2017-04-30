/**
 * 
 */
package ufrpe.fpa.q6.model.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leonardo
 *
 */
public class Building {
	private String name;
	private int floorsNumber, apartmentsPerFloor, totalApartaments;
	private Address address;
	private List<CommonAreaItem> commonArea;
	private Apartment[] apartments;
	/**
	 * @param name
	 * @param floorsNumber
	 * @param apartmentsPerFloor
	 * @param address
	 */
	public Building(String name, int floorsNumber, int apartmentsPerFloor, Address address) {
		super();
		this.name = name;
		this.floorsNumber = floorsNumber;
		this.apartmentsPerFloor = apartmentsPerFloor;
		this.address = address;
		this.commonArea = new ArrayList<>();
		this.totalApartaments = floorsNumber * apartmentsPerFloor;
		this.apartments = new Apartment[totalApartaments];
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the floorsNumber
	 */
	public int getFloorsNumber() {
		return floorsNumber;
	}
	
	/**
	 * @return the apartmentsPerFloor
	 */
	public int getApartmentsPerFloor() {
		return apartmentsPerFloor;
	}
	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * @return the commonArea
	 */
	public List<CommonAreaItem> getCommonArea() {
		return commonArea;
	}
	
	/**
	 * @return the apartments
	 */
	public Apartment[] getApartments() {
		return apartments;
	}
	
	/**
	 * @return the totalApartaments
	 */
	public int getTotalApartaments() {
		return totalApartaments;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String stringReturn;
		
		stringReturn = "\nNome: " + this.name + 
				"\nNúmero de andares: " + this.floorsNumber + 
				"\nApartamentos por andar: " + this.apartmentsPerFloor +
				
				"\n##Endereço##" + 
				this.address.toString() + 
				
				"\n##Área comum##";
		
		for (CommonAreaItem commonArea : this.commonArea)
			stringReturn += "\n" + commonArea.toString();
			
		stringReturn += "\n##Todos os apartamentos##"; 
		for (int i = 0; i < apartments.length; i++)
			stringReturn += "\n" + apartments[i].toString();
		
		return stringReturn;
		
	}

}
