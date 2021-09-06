package com.revature.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.dao.PlayerDAO;
import com.revature.dao.dbutil.MySqlConnection;
import com.revature.exceptions.BusinessException;
import com.revature.model.Player;

public class PlayerDAOImpl implements PlayerDAO{

	@Override
	public List<Player> getAllPlayers() throws BusinessException {

		List<Player> playerList = new ArrayList<>();
		try(Connection connection = MySqlConnection.getConnection()){
			
			String sql = "select id, name, age, gender, city, sportsName, contact from player";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				Player player = new Player();
				
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				
				playerList.add(player);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			throw new BusinessException("Internal Error occured, please contact admin");
		}
		
		return playerList;
	}

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c = 0;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "insert into player(id, name, age, gender, city, sportsName, contact) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getGender());
			preparedStatement.setString(5, player.getCity());
			preparedStatement.setString(6, player.getSportsName());
			preparedStatement.setLong(7, player.getContact());
			
			c = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			throw new BusinessException("Internal Error occured, please contact admin");
		}
		return c;
	}

	@Override
	public int updatePlayer(int id, long contact) throws BusinessException {
		int c = 0;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "update player set contact = ? where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			preparedStatement.setInt(2, id);
			
			c = preparedStatement.executeUpdate();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			throw new BusinessException("Internal Error occured, please contact admin");
		}
		return c;
	}

	@Override
	public int deletePlayer(int id) throws BusinessException {
		int c = 0; 
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "delete from player where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			c = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			throw new BusinessException("Internal Error occured, please contact admin");
		}
		return c;
	}
	
	

}
