package com.jdbc.util;

public class DatabaseUtil {

	private static final String DRIVER_PATH="com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL ="jdbc:mysql://localhost";
	private static final String USR_NAME="root";
	private static final String PASSWORD="Admin123";
	
	public DatabaseUtil() throws ClassNotFoundException{
		try {
			Class.forName(DRIVER_PATH);
		} catch (ClassNotFoundException e) {
			
			throw new ClassNotFoundException("Something went wrong: " + e);
		}
	}
}
