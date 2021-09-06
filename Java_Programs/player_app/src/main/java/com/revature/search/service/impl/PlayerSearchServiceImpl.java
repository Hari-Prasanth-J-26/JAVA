package com.revature.search.service.impl;

import java.util.List;

import com.revature.dao.PlayerSearchDAO;
import com.revature.dao.impl.PlayerSearchDAOImpl;
import com.revature.exceptions.BusinessException;
import com.revature.model.Player;
import com.revature.search.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService{
	
	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if(id < 100 || id > 1000) {
			throw new BusinessException("Invalid Player ID "+id);
		}
		else {
			player = playerSearchDAO.getPlayerById(id);
			
		}
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		String mobile = contact+"";
		if(mobile.matches("[1-9]{1}[0-9]{9}")) {
			player = playerSearchDAO.getPlayerByContact(contact);
		}
		else {
			throw new BusinessException("Invalid Player contact "+contact);
			
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		List<Player> playerList = null;
		if(name.matches("[a-zA-Z ]{2,15}")) {
			playerList = playerSearchDAO.getPlayersByName(name);
		}
		else {
			throw new BusinessException("Invaid name "+name);
		}
		return playerList;	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		List<Player> playerList = null;
		if(teamName.matches("[a-zA-Z]{2,15}")) {
			playerList = playerSearchDAO.getPlayersByTeamName(teamName);
		}
		else {
			throw new BusinessException("Invaid Team name "+teamName);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> playerList = null;
		if(age < 25 || age >50) {
			throw new BusinessException("Invalid age "+age+" age should be grater than 29");
			
		}
		else {
			playerList = playerSearchDAO.getPlayersByAge(age);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playerList = null;
		if(gender.matches("[a-zA-Z]{1}")) {
			playerList = playerSearchDAO.getPlayersByGender(gender);
		}
		else {
			throw new BusinessException("Invaid Gender "+gender);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		List<Player> playerList = null;
		if(city.matches("[a-zA-Z]{2,15}")) {
			playerList = playerSearchDAO.getPlayersByCity(city);
		}
		else {
			throw new BusinessException("Invaid city "+city);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException {
		List<Player> playerList = null;
		if(sportsName.matches("[a-zA-Z]{2,15}")) {
			playerList = playerSearchDAO.getPlayersBySportsName(sportsName);
		}
		else {
			System.out.println(sportsName);
			throw new BusinessException("Invaid sportsName "+sportsName);
			
		}
		return playerList;
	}

}
