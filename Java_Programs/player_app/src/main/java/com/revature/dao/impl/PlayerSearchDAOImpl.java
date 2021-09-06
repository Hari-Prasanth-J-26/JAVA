package com.revature.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.dao.PlayerSearchDAO;
import com.revature.dao.dbutil.MySqlConnection;
import com.revature.exceptions.BusinessException;
import com.revature.model.Player;
import com.revature.model.Team;

public class PlayerSearchDAOImpl implements PlayerSearchDAO{
	
	private static Logger log = Logger.getLogger(PlayerSearchDAOImpl.class);

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select p.id, name, age, gender, city, sportsName, contact,teamId, teamName from player p join team t on p.teamId=t.id where p.id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
			}
			else {
				throw new BusinessException("Entered player ID "+id+" doesn't exist");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, Please contact admin");
		}
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select p.id, name, age, gender, city, sportsName, contact,teamId, teamName from player p join team t on p.teamId=t.id where contact=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
			}
			else {
				throw new BusinessException("Entered player contact "+contact+" doesn't exist");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, Please contact admin");
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		Player player = null;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select p.id, name, age, gender, city, sportsName, contact,teamId, teamName from player p join team t on p.teamId=t.id where name=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No player under this name "+name);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, Please contact admin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		Player player = null;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select p.id, name, age, gender, city, sportsName, contact,teamId, teamName from player p join team t on p.teamId=t.id where t.teamName=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No players for this team "+teamName);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, Please contact admin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		Player player = null;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select p.id, name, age, gender, city, sportsName, contact, teamId, teamName from player p join team t on p.teamId=t.id where age>?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No players are greater than this age "+age);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, Please contact admin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		Player player = null;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select p.id, name, age, gender, city, sportsName, contact, teamId, teamName from player p join team t on p.teamId=t.id where gender=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, gender);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No players under this gender "+gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, Please contact admin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		Player player = null;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select p.id, name, age, gender, city, sportsName, contact, teamId, teamName from player p join team t on p.teamId=t.id where city=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, city);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No players under this city "+city);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, Please contact admin");
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException {
		List<Player> playerList = new ArrayList<>();
		Player player = null;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select p.id, name, age, gender, city, sportsName, contact, teamId, teamName from player p join team t on p.teamId=t.id where sportsName=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, sportsName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				Team team = new Team();
				team.setId(resultSet.getInt("teamId"));
				team.setTeamName(resultSet.getString("teamName"));
				player.setTeam(team);
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No players under this city "+sportsName);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, Please contact admin");
		}
		return playerList;
	
	
	}
		
}
