package com.revature.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.dao.TeamDAO;
import com.revature.dao.dbutil.MySqlConnection;
import com.revature.exceptions.BusinessException;
import com.revature.model.Team;

public class TeamDAOImpl implements TeamDAO {

	@Override
	public Team createTeam(Team team) throws BusinessException {
		
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "insert into team (teamName) values (?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, team.getTeamName());
			int c = preparedStatement.executeUpdate();
			if(c==1) {
				ResultSet resultSet = preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					team.setId(resultSet.getInt(1));
				}
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured, please contact admin..");
		}
		return team;
	}

	@Override
	public List<Team> getAllTeams() throws BusinessException {
		List<Team> teamList = new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select id, teamName from team";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet  = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team = new Team();
				team.setId(resultSet.getInt("id"));
				team.setTeamName(resultSet.getString("teamName"));
				teamList.add(team);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured, please contact admin..");
		}
		return teamList;
	}

	@Override
	public List<Team> getTeamsByName(String teamName) throws BusinessException {
		List<Team> teamList = new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select id, teamName from team where teamName = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName); 
			ResultSet resultSet  = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team = new Team();
				team.setId(resultSet.getInt("id"));
				team.setTeamName(resultSet.getString("teamName"));
				teamList.add(team);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured, please contact admin..");
		}
		return teamList;
	}

}
