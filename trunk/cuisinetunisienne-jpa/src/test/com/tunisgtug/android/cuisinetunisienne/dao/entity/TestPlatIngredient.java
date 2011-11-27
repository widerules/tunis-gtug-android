package test.com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.sql.SQLException;

import org.junit.Test;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Plat;


/**
 * JUnit Test case class for : Plat - Ingredient
 *
 */
public class TestPlatIngredient {
	// we are using the "test.sqlite" database
	private final static String DATABASE_URL = "jdbc:sqlite:android/res/test.sqlite";
	
	private Dao<Plat, Long> platDao;
	
	@Test
	public void setSpecialty() {
		
		// pooled connection source
		JdbcPooledConnectionSource connectionSource;
		try {
			connectionSource = new JdbcPooledConnectionSource(DATABASE_URL);
			// only keep the connections open for 5 minutes
			connectionSource.setMaxConnectionAgeMillis(5 * 60 * 1000);
			// change the check-every milliseconds from 30 seconds to 60
			connectionSource.setCheckConnectionsEveryMillis(60 * 1000);
			// for extra protection, enable the testing of connections
			// right before they are handed to the user
			connectionSource.setTestBeforeGet(true);
			
			setupDatabase(connectionSource);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	* Setup our database and DAOs
	*/
	private void setupDatabase(ConnectionSource p_connectionSource) throws SQLException {
		
		platDao = DaoManager.createDao(p_connectionSource, Plat.class);

		TableUtils.dropTable(p_connectionSource, Plat.class, false);
		// if you need to create the table
		TableUtils.createTable(p_connectionSource, Plat.class);
	}
}
