package ro.fiipractic.core.service.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ro.fiipractic.core.base.ConfigBean;
import ro.fiipractic.core.dao.GrupaDAO;
import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.service.GrupaService;

/**
 * JUnit test for {@link GrupaDAO}.
 * 
 * @author CosminS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
public class GrupaServiceTest {

	private ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBean.class);

	@Autowired
	private GrupaService grupaService;

	/**
	 * Dummy test for checking the persistence.
	 */
	@Test
	public void testCreate() {
		Grupa grupa = new Grupa();
		grupa.setNumeGrupa("FII PRACTIC 2016 - GROUP A");

		grupa = grupaService.create(grupa);

		assertNotNull(grupa.getId());
	}

	/**
	 * Spring bean test.
	 */
	@Test
	public void testCreateSpringBean() {
		Grupa grupa = ctx.getBean(Grupa.class);
		grupa.setNumeGrupa("FII PRACTIC 2016 - GROUP B");

		grupa = grupaService.create(grupa);

		assertNotNull(grupa.getId());
	}

	/**
	 * Ge grupa by id test.
	 */
	@Test
	public void testGetGrupa() {
		Grupa created = new Grupa();
		created.setNumeGrupa("FII PRACTIC 2016 - GROUP C");

		created = grupaService.create(created);

		Grupa found = grupaService.getGrupa(created.getId());

		assertNotNull(found);
	}
}