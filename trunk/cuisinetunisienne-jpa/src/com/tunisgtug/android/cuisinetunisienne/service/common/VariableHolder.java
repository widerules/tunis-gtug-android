package com.tunisgtug.android.cuisinetunisienne.service.common;

import com.j256.ormlite.support.ConnectionSource;

public final class VariableHolder {
	private static ConnectionSource connection;

	public static ConnectionSource getConnection() {
		return connection;
	}

	public static void setConnection(ConnectionSource connection) {
		VariableHolder.connection = connection;
	}

}
