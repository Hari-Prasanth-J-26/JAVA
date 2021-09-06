package com.revature.dao;

import java.util.List;

import com.revature.exceptions.BusinessException;
import com.revature.model.Team;

public interface TeamDAO {
	
	public Team createTeam(Team team) throws BusinessException;
	public List<Team> getAllTeams() throws BusinessException;
	public List<Team> getTeamsByName(String teamName) throws BusinessException;
	
	

}
