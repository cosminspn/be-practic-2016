/**
 * 
 */
package ro.fiipractic.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.service.GrupaService;

/**
 * REST API for {@link Grupa}.
 * 
 * @author CosminS
 *
 */
@Service
@Path("/grupa")
public class GrupaRestService {

	@Autowired
	private GrupaService grupaService;

	/**
	 * REST service for creating a group.
	 * 
	 * @param grupa
	 *            the group.
	 * @return the created group.
	 */
	@Path("/create")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Grupa create(Grupa grupa) {
		return grupaService.create(grupa);
	}

	/**
	 * REST service for finding all the groups.
	 * 
	 * @return list with all the groups.
	 */
	@Path("/find-all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Grupa> findAll() {
		return grupaService.findAll();
	}

	/**
	 * REST service for finding the group by id.
	 * 
	 * @param id
	 *            the id of the group.
	 * @return the group with the specified id.
	 */
	@Path("/find/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Grupa findById(@PathParam("id") long id) {
		return grupaService.getGrupa(id);
	}
}