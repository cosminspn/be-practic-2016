package ro.fiipractic.core.dao.test;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ro.fiipractic.core.base.ConfigBean;
import ro.fiipractic.core.dao.GrupaDAO;
import ro.fiipractic.core.dao.GrupaDAOImpl;
import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.repository.GrupaService;

/**
 * JUnit test for {@link GrupaDAO}.
 * 
 * @author CosminS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
public class GrupaDAOTest {

	ApplicationContext ctx = 
		      new AnnotationConfigApplicationContext(ConfigBean.class);

	@Autowired
	private GrupaDAO grupaDAO;
	
	@Inject
	private GrupaService grupaService;

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
	
	@Test
	public void testCreateSpringBean(){
		Grupa grupa =  ctx.getBean(Grupa.class);
		grupa.setNumeGrupa("FII PRACTIC 2016 - GROUP B");

		grupa = grupaDAO.create(grupa);
		
		assertNotNull(grupa.getId());
	}
	
	@Test
	public void testGetGrupa() {
		Grupa grupa = grupaService.getGrupa(2L);
		assertNotNull(grupa);
	}
}