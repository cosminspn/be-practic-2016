package ro.fiipractic.core.dao.test;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ro.fiipractic.core.dao.GrupaDAO;
import ro.fiipractic.core.entity.Grupa;

/**
 * JUnit test for {@link GrupaDAO}.
 * 
 * @author CosminS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
public class GrupaDAOTest {

	@Autowired
	private GrupaDAO grupaDAO;

	/**
	 * Dummy test for checking the persistence.
	 */
	@Test
	public void testCreate() {
		Grupa grupa = new Grupa();
		grupa.setNumeGrupa("FII PRACTIC 2016 - GROUP A");

		grupa = grupaDAO.create(grupa);
		
		assertNotNull(grupa.getId());
	}
}