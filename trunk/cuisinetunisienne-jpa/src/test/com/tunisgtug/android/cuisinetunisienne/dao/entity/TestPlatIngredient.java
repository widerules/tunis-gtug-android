package test.com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.spring.TableCreator;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Ingredient;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Plat;
import com.tunisgtug.android.cuisinetunisienne.service.common.VariableHolder;


/**
 * JUnit Test case class for : Plat - Ingredient
 *
 */
public class TestPlatIngredient {
	// we are using the "test.sqlite" database
	private final static String DATABASE_URL = "jdbc:sqlite:android/res/test.sqlite";

	// here is a list of XML files to be loaded by Spring
	private String[] configNames = new String[] { "classpath:/com/tunisgtug/android/cuisinetunisienne/spring/db.xml" };
	
	private RuntimeExceptionDao<Plat, Long> platDao;

	@Test
	public void testPlatIngredient() {
		
		try{
			VariableHolder.setConnection(getConnection());
			
			setupDatabase(getConnection());
			Plat l_plat = getNewPlat();
			addIngredient(l_plat);
			
			platDao.create(l_plat);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Plat getNewPlat() {
		Plat l_plat = new Plat();
		l_plat.setCalories(100);
		l_plat.setDescription("3ejja bel mergaz");
		l_plat.setPlatname("3ejja bel mergaz");
		l_plat.setPlatrating(10);
		l_plat.setPreparationtime(30);
		l_plat.setPrice(4500);
		
		return l_plat;
	}

	private void addIngredient(Plat p_plat) {
		Ingredient l_ingredient = new Ingredient();
		l_ingredient.setIngname("3dham");
		p_plat.getListIngredient().add(l_ingredient);
	}

	/**
	 * Setup JDBC Connection for test
	 */
	private ConnectionSource getConnection() throws SQLException {
		// pooled connection source
		JdbcPooledConnectionSource l_connectionSource = new JdbcPooledConnectionSource(DATABASE_URL);
		// only keep the connections open for 5 minutes
		l_connectionSource.setMaxConnectionAgeMillis(5 * 60 * 1000);
		// change the check-every milliseconds from 30 seconds to 60
		l_connectionSource.setCheckConnectionsEveryMillis(60 * 1000);
		// for extra protection, enable the testing of connections
		// right before they are handed to the user
		l_connectionSource.setTestBeforeGet(true);
		return l_connectionSource;
	}
	
	/**
	 * Setup our database and DAOs
	 */
	private void setupDatabase(ConnectionSource p_connectionSource) throws SQLException {
		
		platDao = RuntimeExceptionDao.createDao(p_connectionSource, Plat.class);

		TableUtils.dropTable(p_connectionSource, Plat.class, false);
		// if you need to create the table
		TableUtils.createTable(p_connectionSource, Plat.class);
	}
}
