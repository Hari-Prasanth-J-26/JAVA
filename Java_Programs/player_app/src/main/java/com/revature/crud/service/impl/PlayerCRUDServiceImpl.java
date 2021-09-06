package com.revature.crud.service.impl;

import java.util.List;

import com.revature.crud.service.PlayerCRUDService;
import com.revature.curd.dao.PlayerCURDDAO;
import com.revature.curd.dao.impl.PlayerCURDDAOImpl;
import com.revature.exceptions.BusinessException;
import com.revature.model.Player;

public class PlayerCRUDServiceImpl implements  PlayerCRUDService{
	
	private PlayerCURDDAO playerCURDDAO = new PlayerCURDDAOImpl();

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c = 0;
		c = playerCURDDAO.createPlayer(player);
		return 0;
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
