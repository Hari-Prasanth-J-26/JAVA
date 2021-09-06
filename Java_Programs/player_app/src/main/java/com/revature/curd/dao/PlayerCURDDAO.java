package com.revature.curd.dao;

import java.util.List;

import com.revature.exceptions.BusinessException;
import com.revature.model.Player;

public interface PlayerCURDDAO {
	
	public int createPlayer(Player player) throws BusinessException; 
	public int updatePlayer(int id, long contact) throws BusinessException;
	public int deletePlayer(int id) throws BusinessException;
	public List<Player> readPlayer() throws BusinessException;

}
