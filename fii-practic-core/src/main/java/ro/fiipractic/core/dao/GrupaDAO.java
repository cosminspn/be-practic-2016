package ro.fiipractic.core.dao;

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
}