package ro.fiipractic.core.service;

import java.util.List;

import ro.fiipractic.core.entity.Grupa;

/**
 * Service for {@link Grupa}.
 * @author Cosmin-HP
 * @since Mar 27, 2016
 * @version 1.0
 */
public interface GrupaService {

	/**
	 * Creates a group.
	 * 
	 * @param grupa
	 *            the group to be created.
	 * @return the created group.
	 */
	public Grupa create(Grupa grupa);

	/**
	 * Get a group by id.
	 * 
	 * @author Cosmin-HP
	 * @since Mar 27, 2016
	 * @param id the id of the group.
	 * @return the group.
	 */
	public Grupa getGrupa(Long id);
	
	/**
	 * Find all groups.
	 * 
	 * @return all groups.
	 */
	public List<Grupa> findAll();
}