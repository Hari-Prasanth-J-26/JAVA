package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectingMySQL {

	public static void main(String[] args) {
		
		Connection connection =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
			String url = "jdbc:mysql://localhost:3306/revature_mass_india";
			String username = "root";
			String password = "mysqlROOT@1";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successfully done");
			
			Statement statement = connection.createStatement();
			String sql = "select id, name, age, gender, city, sportsName, contact from player";
			
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed successfully");
			
			while(resultSet.next()) {
				System.out.print("Id :"+resultSet.getInt("id"));
				System.out.print(" Name :"+resultSet.getString("name"));
				System.out.print(" Age :"+resultSet.getInt("age"));
				System.out.print(" Gender :"+resultSet.getString("gender"));
				System.out.print(" City :"+resultSet.getString("city"));
				System.out.print(" Sport name :"+resultSet.getString("sportsName"));
				System.out.println(" Contact :"+resultSet.getLong("contact"));
			}
			System.out.println("Results printed successfully");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
