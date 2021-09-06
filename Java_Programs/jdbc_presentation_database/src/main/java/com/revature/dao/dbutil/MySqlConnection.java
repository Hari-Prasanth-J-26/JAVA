package com.revature.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
	private static Connection connection = null;
	
	private MySqlConnection() {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url = "jdbc:mysql://localhost:3306/revature_mass_india";
		String username = "root";
		String password = "mysqlROOT@1";
		connection = DriverManager.getConnection(url, username, password);
		
		return connection;
		
	}
	
	
}
