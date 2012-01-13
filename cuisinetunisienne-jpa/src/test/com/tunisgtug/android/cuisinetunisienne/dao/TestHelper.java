package test.com.tunisgtug.android.cuisinetunisienne.dao;

import java.sql.SQLException;

import org.junit.After;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Ingredient;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Plat;

public class TestHelper {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	// we are using the "test.sqlite" database
	private final static String DATABASE_URL = "jdbc:sqlite:android/res/test.sqlite";
	
	private ConnectionSource connectionSource;
	private volatile boolean isOpen = true;

	private Dao<Plat, Long> platDao;
	private Dao<Ingredient, Long> ingredientDao;

	/**
	 * Setup our database and DAOs
	 */
	protected TestHelper(Class<?> [] p_daoClazz) throws SQLException {
		for(Class<?> l_dao : p_daoClazz) {
			DaoManager.createDao(getConnectionSource(), l_dao);
		}
		for(Class<?> l_dao : p_daoClazz) {
			TableUtils.dropTable(getConnectionSource(), l_dao, false);
		}
		for(Class<?> l_dao : p_daoClazz) {
			TableUtils.createTable(getConnectionSource(), l_dao);
		}

	}
	
	/**
	 * Setup JDBC Connection for test
	 */
	protected ConnectionSource getConnectionSource() throws SQLException {
		if (!isOpen) {
			// we don't throw this exception, but log it for debugging purposes
			logger.error(new IllegalStateException(), "Getting connectionSource called after closed");
		}
		if(connectionSource == null) {
			// pooled connection source
			JdbcPooledConnectionSource l_connectionSource = new JdbcPooledConnectionSource(DATABASE_URL);
			// only keep the connections open for 5 minutes
			l_connectionSource.setMaxConnectionAgeMillis(5 * 60 * 1000);
			// change the check-every milliseconds from 30 seconds to 60
			l_connectionSource.setCheckConnectionsEveryMillis(60 * 1000);
			// for extra protection, enable the testing of connections
			// right before they are handed to the user
			l_connectionSource.setTestBeforeGet(true);
			connectionSource = l_connectionSource;
		}
		return connectionSource;
	}

	/**
	 * Close any open connections.
	 */
	public void close() throws SQLException {
		connectionSource.close();
		/*
		 * We used to set connectionSource to null here but now we just set the closed flag and then log heavily if
		 * someone uses getConectionSource() after this point.
		 */
		isOpen = false;
	}

	@After
	protected void finalyse() throws SQLException {
		close();
	}
	
	public Dao<Plat, Long> getPlatDao() throws SQLException {
		if(platDao == null) {
			platDao = DaoManager.createDao(getConnectionSource(), Plat.class);
		}
		return platDao;
	}

	public Dao<Ingredient, Long> getIngredientDao() throws SQLException {
		if(ingredientDao == null) {
			ingredientDao = DaoManager.createDao(getConnectionSource(), Ingredient.class);
		}
		return ingredientDao;
	}
	
}
