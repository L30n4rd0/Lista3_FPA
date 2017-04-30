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
public class RepositorySQL implements InterfaceRepository {

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#insertBuilding(ufrpe.fpa.q6.model.vo.Building)
	 */
	@Override
	public boolean insertBuilding(Building building) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#alterBuilding(ufrpe.fpa.q6.model.vo.Building)
	 */
	@Override
	public void alterBuilding(Building building) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#deleteBuilding(java.lang.String)
	 */
	@Override
	public boolean deleteBuilding(String name) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#getAllBuilding()
	 */
	@Override
	public List<Building> getAllBuilding() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#getBuildingByName(java.lang.String)
	 */
	@Override
	public Building getBuildingByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ufrpe.fpa.q6.model.dao.InterfaceRepository#getFilteredBuildingList(ufrpe.fpa.q6.model.vo.Building)
	 */
	@Override
	public List<Building> getFilteredBuildingList(Building building) {
		// TODO Auto-generated method stub
		return null;
	}

}
