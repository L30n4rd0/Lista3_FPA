/**
 * 
 */
package ufrpe.fpa.q6.model.dao;

import java.util.ArrayList;
import java.util.List;

import ufrpe.fpa.q6.model.vo.Apartment;
import ufrpe.fpa.q6.model.vo.Building;
import ufrpe.fpa.q6.model.vo.CommonAreaItem;

/**
 * @author leonardo
 *
 */
public class RepositoryArray implements InterfaceRepository {
	
	private List<Building> buildingList;

	/**
	 * 
	 */
	public RepositoryArray() {
		this.buildingList = new ArrayList<>();
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#insertImmobile(ufrpe.fpa.q6.model.vo.Building)
	 */
	@Override
	public boolean insertBuilding(Building building) {
		if (this.getBuildingByName(building.getName()) == null) {
			this.buildingList.add(building);
			return true;
			
		} else
			return false;

	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#alterImmobile(ufrpe.fpa.q6.model.vo.Building)
	 */
	@Override
	public void alterBuilding(Building building) {
		this.buildingList.remove(this.getBuildingByName(building.getName()));
		this.buildingList.add(building);

	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#deleteImmobile(java.lang.String)
	 */
	@Override
	public boolean deleteBuilding(String name) {
		
		Building buildingToDelete = this.getBuildingByName(name);
		
		if (buildingToDelete != null) {
			this.buildingList.remove(buildingToDelete);
			return true;
			
		} else
			return false;
		
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#getAllImmobiles()
	 */
	@Override
	public List<Building> getAllBuilding() {
		
		return this.buildingList;
		
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#findImmobileByName(java.lang.String)
	 */
	@Override
	public Building getBuildingByName(String name) {

		for (Building building : this.buildingList)
			if (building.getName().equalsIgnoreCase(name))
				return building;
		
		return null;
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#getFilteredImmobileList(ufrpe.fpa.q6.model.vo.Building)
	 */
	@Override
	public List<Building> getFilteredBuildingList(Building buildingFilter) {
		List<Building> listReturn = new ArrayList<>();
		
		for (Building buildingTemp : this.buildingList) {
			
			if (this.checkAttributesMatches(buildingFilter, buildingTemp))
				listReturn.add(buildingTemp);
			
		}
		
		return listReturn;
	}
	
	private boolean checkAttributesMatches(Building buildingFilter, Building building) {
		boolean matcheReturn = true;
		
		if (!buildingFilter.getName().equalsIgnoreCase("") && 
				!buildingFilter.getName().equalsIgnoreCase(building.getName())) {
			return false;
			
		}
		
		if (buildingFilter.getFloorsNumber() != 0 && buildingFilter.getFloorsNumber() != building.getFloorsNumber()) {
			return false;
			
		}
		
		if (buildingFilter.getApartmentsPerFloor() != 0 && buildingFilter.getApartmentsPerFloor() != building.getApartmentsPerFloor()) {
			return false;
			
		}
		
		if (!buildingFilter.getAddress().getCity().equalsIgnoreCase("") && 
				!buildingFilter.getAddress().getCity().equalsIgnoreCase(building.getAddress().getCity())) {
			return false;
			
		}
		
		if (!buildingFilter.getAddress().getCountry().equalsIgnoreCase("") && 
				!buildingFilter.getAddress().getCountry().equalsIgnoreCase(building.getAddress().getCountry())) {
			return false;
			
		}
		
		if (!buildingFilter.getAddress().getNeighborhood().equalsIgnoreCase("") && 
				!buildingFilter.getAddress().getNeighborhood().equalsIgnoreCase(building.getAddress().getNeighborhood())) {
			return false;
			
		}
		
		if (!buildingFilter.getAddress().getState().equalsIgnoreCase("") && 
				!buildingFilter.getAddress().getState().equalsIgnoreCase(building.getAddress().getState())) {
			return false;
			
		}
		
		if (!buildingFilter.getAddress().getStreet().equalsIgnoreCase("") && 
				!buildingFilter.getAddress().getStreet().equalsIgnoreCase(building.getAddress().getStreet())) {
			return false;
			
		}
		
		if (buildingFilter.getAddress().getNumber() != 0 && buildingFilter.getAddress().getNumber() != building.getAddress().getNumber()) {
			return false;
			
		}
		
		/*
		 * Check matches common area
		 * */
		for (CommonAreaItem areaItem1 : buildingFilter.getCommonArea()) {
			
			if (!areaItem1.getType().equalsIgnoreCase("")) {
				boolean containsItem = false;
				
				for (CommonAreaItem areaItem2 : building.getCommonArea()) {
					if (areaItem1.getType().equalsIgnoreCase(areaItem2.getType())) {
						containsItem = true;
						break;
					}
				}
				
				if (!containsItem)
					return false;
						
			}
			
		}
		
		/*
		 * Check matches apartments
		 * */
		for (Apartment apartmentFilter : buildingFilter.getApartments()) {
			/*
			 * Check if exists same registered apartment with equal BathroomQuantity number
			 * */
			if (apartmentFilter.getBathroomQuantity() != 0) {
				boolean equalBathroomQuantity = false;
				
				for (Apartment apartment : building.getApartments()) {
					if (apartmentFilter.getBathroomQuantity() == apartment.getBathroomQuantity()) {
						equalBathroomQuantity = true;
						break;
					}
				}
				
				if (!equalBathroomQuantity)
					return false;
						
			}
			
			/*
			 * Check if exists same registered apartment with equal BedroomQuantity number
			 * */
			if (apartmentFilter.getBedroomQuantity() != 0) {
				
				boolean equalBedroomQuantity = false;
				
				for (Apartment apartment : building.getApartments()) {
					if (apartmentFilter.getBedroomQuantity() == apartment.getBedroomQuantity()) {
						equalBedroomQuantity = true;
						break;
					}
				}
				
				if (!equalBedroomQuantity)
					return false;
						
			}
			
			/*
			 * Check if exists same registered apartment with equal BedroomSuiteQty number
			 * */
			if (apartmentFilter.getBedroomSuiteQty() != 0) {
				boolean equalBedroomSuiteQty = false;
				
				for (Apartment apartment : building.getApartments()) {
					if (apartmentFilter.getBedroomSuiteQty() == apartment.getBedroomSuiteQty()) {
						equalBedroomSuiteQty = true;
						break;
					}
				}
				
				if (!equalBedroomSuiteQty)
					return false;
						
			}
			
			/*
			 * Check if exists same registered apartment with equal ParkingSpaces number
			 * */
			if (apartmentFilter.getParkingSpaces() != 0) {
				boolean equaParkingSpaces = false;
				
				for (Apartment apartment : building.getApartments()) {
					if (apartmentFilter.getParkingSpaces() == apartment.getParkingSpaces()) {
						equaParkingSpaces = true;
						break;
					}
				}
				
				if (!equaParkingSpaces)
					return false;
						
			}
			
			/*
//			 * Check if exists same registered apartment with equal Price valor
			 * */
			if (apartmentFilter.getPrice() != 0.0) {
				boolean equalTotalArea = false;
				
				for (Apartment apartment : building.getApartments()) {
					if (apartmentFilter.getPrice() == apartment.getPrice()) {
						equalTotalArea = true;
						break;
					}
				}
				
				if (!equalTotalArea)
					return false;
						
			}
			
			/*
			 * Check if exists same registered apartment with equal TotalArea number
			 * */
			if (apartmentFilter.getTotalArea() != 0.0) {
				boolean equalTotalArea = false;
				
				for (Apartment apartment : building.getApartments()) {
					if (apartmentFilter.getTotalArea() == apartment.getTotalArea()) {
						equalTotalArea = true;
						break;
					}
				}
				
				if (!equalTotalArea)
					return false;
						
			}
			
		}
		
		return matcheReturn;
		
	}

}
