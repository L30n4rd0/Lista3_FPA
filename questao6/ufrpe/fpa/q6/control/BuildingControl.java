/**
 * 
 */
package ufrpe.fpa.q6.control;

import java.util.List;

import ufrpe.fpa.q6.model.dao.RepositoryArray;
import ufrpe.fpa.q6.model.dao.InterfaceRepository;
import ufrpe.fpa.q6.model.vo.Building;

/**
 * @author leonardo
 *
 */
public class BuildingControl {
	
	private InterfaceRepository repository;
	
	public BuildingControl() {
		this.repository = new RepositoryArray();
		
	}
	
	public boolean insertBuilding(Building building) {
		return this.repository.insertBuilding(building);
		
	}
	
	public void alterBuilding(Building building) {
		this.repository.alterBuilding(building);
		
	}
	
	public void deleteBuilding(String name) {
		this.repository.deleteBuilding(name);
		
	}
	
	public List<Building> getAllBuilding() {
		return this.repository.getAllBuilding();
		
	}
	
	public Building getBuildingByName(String name) {
		return this.repository.getBuildingByName(name);
		
	}
	
	public List<Building> getFilteredBuildingList(Building building) {
		return this.repository.getFilteredBuildingList(building);
		
	}

}
