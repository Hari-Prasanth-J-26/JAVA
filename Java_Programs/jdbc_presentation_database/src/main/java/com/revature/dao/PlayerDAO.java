package com.revature.dao;

import java.util.List;

import com.revature.exceptions.BusinessException;
import com.revature.model.Player;

public interface PlayerDAO {
	
	public List<Player> getAllPlayers() throws BusinessException;
	
	public int createPlayer(Player player) throws BusinessException;
	
	public int updatePlayer(int id, long contact) throws BusinessException;
	
	public int deletePlayer(int id) throws BusinessException;
 
}
