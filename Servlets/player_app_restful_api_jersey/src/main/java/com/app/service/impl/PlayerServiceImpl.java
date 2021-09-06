package com.app.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.app.model.Player;
import com.app.service.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	
	private static Map<Integer, Player> playerMap = new HashMap<>();
	private static int count=0;

	@Override
	public Player createPlayer(Player player) {
		player.setId(++count);
		playerMap.put(count, player);
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
		playerMap.put(player.getId(), player);
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		return playerMap.get(id);
	}

	@Override
	public void deletePlayerById(int id) {
		playerMap.remove(id);
		
	}

	@Override
	public List<Player> getAllPlayers() {
		
		return new ArrayList<>(playerMap.values());
	}

	@Override
	public List<Player> getAllPlayersByTeamName(String teamName) {
		
		return playerMap.values().stream().filter(x->x.getTeamName().equals(teamName)).collect(Collectors.toList());
	}

}
