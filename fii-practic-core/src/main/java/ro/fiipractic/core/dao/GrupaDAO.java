package ro.fiipractic.core.dao;

import java.util.List;

import ro.fiipractic.core.base.AbstractDAO;
import ro.fiipractic.core.entity.Grupa;

/**
 * DAO interface for {@link Grupa}.
 * 
 * @author CosminS
 *
 */
public interface GrupaDAO extends AbstractDAO {

	/**
	 * Creates a group.
	 * 
	 * @param grupa
	 *            the group to be created.
	 * @return the created group.
	 */
	public Grupa create(Grupa grupa);

	/**
	 * Search the group by id.
	 * 
	 * @param id
	 *            the id of the group.
	 * @return the group with the specified id.
	 */
	public Grupa getGrupa(Long id);

	/**
	 * Find all groups.
	 * 
	 * @return all groups.
	 */
	public List<Grupa> findAll();
}