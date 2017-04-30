/**
 * 
 */
package ufrpe.fpa.q6.model.dao;

import java.util.ArrayList;
import java.util.List;

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
	public List<Building> getFilteredBuildingList(Building building) {
		List<Building> listReturn = new ArrayList<>();
		
		for (Building buildingTemp : this.buildingList) {
			
			if (this.checkAttributesMatches(building, buildingTemp))
				listReturn.add(buildingTemp);
			
		}
		
		return listReturn;
	}
	
	private boolean checkAttributesMatches(Building building1, Building building2) {
		boolean matcheReturn = true;
		
		if (building1.getFloorsNumber() != 0 && building1.getFloorsNumber() != building2.getFloorsNumber()) {
			return false;
			
		}
		
		if (building1.getApartmentsPerFloor() != 0 && building1.getApartmentsPerFloor() != building2.getApartmentsPerFloor()) {
			return false;
			
		}
		
		if (!building1.getAddress().getCity().equalsIgnoreCase("") && 
				!building1.getAddress().getCity().equalsIgnoreCase(building2.getAddress().getCity())) {
			return false;
			
		}
		
		if (!building1.getAddress().getCountry().equalsIgnoreCase("") && 
				!building1.getAddress().getCountry().equalsIgnoreCase(building2.getAddress().getCountry())) {
			return false;
			
		}
		
		if (!building1.getAddress().getNeighborhood().equalsIgnoreCase("") && 
				!building1.getAddress().getNeighborhood().equalsIgnoreCase(building2.getAddress().getNeighborhood())) {
			return false;
			
		}
		
		if (!building1.getAddress().getState().equalsIgnoreCase("") && 
				!building1.getAddress().getState().equalsIgnoreCase(building2.getAddress().getState())) {
			return false;
			
		}
		
		if (!building1.getAddress().getStreet().equalsIgnoreCase("") && 
				!building1.getAddress().getStreet().equalsIgnoreCase(building2.getAddress().getStreet())) {
			return false;
			
		}
		
		if (building1.getAddress().getNumber() != 0 && building1.getAddress().getNumber() != building2.getAddress().getNumber()) {
			return false;
			
		}
		
		for (CommonAreaItem areaItem1 : building1.getCommonArea()) {
			
			if (!areaItem1.getType().equalsIgnoreCase("")) {
				boolean containsItem = false;
				
				for (CommonAreaItem areaItem2 : building2.getCommonArea()) {
					if (areaItem1.getType().equalsIgnoreCase(areaItem2.getType())) {
						containsItem = true;
						break;
					}
				}
				
				if (!containsItem)
					return false;
						
			}
			
		}
		
		return matcheReturn;
		
	}

}
