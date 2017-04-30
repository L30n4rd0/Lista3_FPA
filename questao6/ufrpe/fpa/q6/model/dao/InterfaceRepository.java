/**
 * 
 */
package ufrpe.fpa.q6.model.dao;

import java.util.List;

import ufrpe.fpa.q6.model.vo.Building;

/**
 * @author leonardo
 *
 */
public interface InterfaceRepository {
	
	/*
	 * Insert a new building to actual repository
	 * */
	public boolean insertBuilding(Building building);
	
	/*
	 * Update data of a building previously registered
	 * */
	public void alterBuilding(Building building);
	
	/*
	 * Delete a building from the actual repository
	 * */
	public void deleteBuilding(String name);
	
	/*
	 * Get all building registered on the actual repository
	 * */
	public List<Building> getAllBuilding();
	
	/*
	 * Get a building by his name
	 * */
	public Building getBuildingByName(String name);
	
	/*
	 * Get a building list filtered by the object's data received as a parameter
	 **/	
	public List<Building> getFilteredBuildingList(Building building);

}
