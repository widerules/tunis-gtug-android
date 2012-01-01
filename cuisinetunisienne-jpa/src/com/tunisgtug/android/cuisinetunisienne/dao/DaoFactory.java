package com.tunisgtug.android.cuisinetunisienne.dao;

import java.sql.SQLException;

import com.j256.ormlite.android.AndroidLog;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.logger.Log;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Ingredient;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Plat;
import com.tunisgtug.android.cuisinetunisienne.service.common.VariableHolder;

public final class DaoFactory {
	private static final AndroidLog LOGGER = new AndroidLog(DaoFactory.class.getCanonicalName());
	
	private static RuntimeExceptionDao<Plat, Long> platDao;
	private static RuntimeExceptionDao<Ingredient, Long> ingredientDao;
	
	private DaoFactory() {
		try {
			platDao = RuntimeExceptionDao.createDao(VariableHolder.getConnection(), Plat.class);
		} catch (SQLException e) {
			if(LOGGER.isLevelEnabled(Log.Level.INFO)) {
				LOGGER.log(Log.Level.INFO, e.getMessage(), e);
			}
		}
	}

	public static RuntimeExceptionDao<Plat, Long> getPlatDao() {
		return platDao;
	}

	public static RuntimeExceptionDao<Ingredient, Long> getIngredientDao() {
		return ingredientDao;
	}
	
}
