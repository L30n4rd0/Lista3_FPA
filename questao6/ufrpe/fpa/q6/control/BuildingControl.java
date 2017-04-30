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
	
	private static BuildingControl uniqueInstance;
	
	private InterfaceRepository repository;
	
	private BuildingControl() {
		uniqueInstance = null;
		this.repository = new RepositoryArray();
		
	}
	
	/*
	 * Create a single instance to facilitate the data management
	 * */  
	public static synchronized BuildingControl getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new BuildingControl();

		return uniqueInstance;
		
	}
	
	public boolean insertBuilding(Building building) {
		return this.repository.insertBuilding(building);
		
	}
	
	public void alterBuilding(Building building) {
		this.repository.alterBuilding(building);
		
	}
	
	public boolean deleteBuilding(String name) {
		return this.repository.deleteBuilding(name);
		
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
