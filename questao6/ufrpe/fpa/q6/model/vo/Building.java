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
	private List<Apartment> apartments;
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
		this.totalApartaments = floorsNumber * apartmentsPerFloor;
		this.commonArea = new ArrayList<>();
		this.apartments = new ArrayList<>();
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
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
	public List<Apartment> getApartments() {
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
				
				"\n\n##Endereço##" + 
				this.address.toString() + 
				
				"\n\n## Área comum ##";
		
		for (CommonAreaItem commonArea : this.commonArea)
			stringReturn += "\n" + commonArea.toString();
			
		stringReturn += "\n\n## Todos os apartamentos ##";
		for (int i = 0; i < apartments.size(); i++)
			stringReturn += "\n>>Apartamento: " + (i + 1) + "\n" + apartments.get(i).toString();
		
		return stringReturn;
		
	}

}
