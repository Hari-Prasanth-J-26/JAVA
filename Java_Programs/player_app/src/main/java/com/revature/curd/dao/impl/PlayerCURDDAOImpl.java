package com.revature.curd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.curd.dao.PlayerCURDDAO;
import com.revature.curd.dao.impl.PlayerCURDDAOImpl;
import com.revature.dao.dbutil.MySqlConnection;
import com.revature.exceptions.BusinessException;
import com.revature.model.Player;

public class PlayerCURDDAOImpl  implements PlayerCURDDAO{
	
	private static Logger log = Logger.getLogger(PlayerCURDDAOImpl.class);

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="insert into player(id, name, age, gender, city, sportsName, contact, team_id, teamName) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getGender());
			preparedStatement.setString(5, player.getCity());
			preparedStatement.setString(6, player.getSportsName());
			preparedStatement.setLong(7, player.getContact());
			preparedStatement.setInt(8, player.getTeam().getId());
			preparedStatement.setString(9, player.getTeam().getTeamName());
			c=preparedStatement.executeUpdate();
			if(c==1) {
				log.info(c+" row created successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured, please contact admin");
		}
		return c;
	}

	@Override
	public int updatePlayer(int id, long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePlayer(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Player> readPlayer() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
