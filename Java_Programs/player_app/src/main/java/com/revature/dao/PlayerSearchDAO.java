package com.revature.dao;

import java.util.List;

import com.revature.exceptions.BusinessException;
import com.revature.model.Player;

public interface PlayerSearchDAO {
	
	public Player getPlayerById(int id) throws BusinessException;
	public Player getPlayerByContact(long contact) throws BusinessException;
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public List<Player> getPlayersByGender(String gender) throws BusinessException;
	public List<Player> getPlayersByCity(String city) throws BusinessException;
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException;
	
	

}
