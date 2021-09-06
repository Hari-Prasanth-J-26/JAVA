package com.revature;

import java.util.List;

import com.revature.dao.PlayerDAO;
import com.revature.dao.TeamDAO;
import com.revature.dao.impl.PlayerDAOImpl;
import com.revature.dao.impl.TeamDAOImpl;
import com.revature.exceptions.BusinessException;
import com.revature.model.Player;
import com.revature.model.Team;

public class PlayerMain {

	public static void main(String[] args) {

		PlayerDAO playerDAO = new PlayerDAOImpl();
		
//		try {
//			List<Player> playerList = playerDAO.getAllPlayers();
//			for(Player player:playerList) {
//				System.out.println(player);
//			}
//				
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
	
		//insert
//		Player player = new Player(101, "Ms Dhoni", 35, "M", "Ranchi", "Cricket", 6666666666L );
//		
//		try {
//			if(playerDAO.createPlayer(player) == 1) {
//				System.out.println("1 row successfully added");
//				System.out.println(player);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		//update
		
//		int id = 103;
//		long contact = 3333333333L;
//		Player player = new Player(id, contact);
//		
//		try {
//			if(playerDAO.updatePlayer(id, contact) == 1) {
//				System.out.println("1 row successfully updated");
//				System.out.println(player);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		//delete
//		int id = 106;
//		Player player = new Player(id);
//	
//		try {
//			if(playerDAO.deletePlayer(id) == 1) {
//				System.out.println(player);
//				System.out.println("1 row deleted successfully");
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		TeamDAO teamDAO = new TeamDAOImpl();
		
		//insert
//		Team t1 = new Team("MI");
//		
//		try {
//			t1 = teamDAO.createTeam(t1);
//			if(t1.getId()!=0) {
//				System.out.println("Team created Successfully");
//				System.out.println(t1);
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
		
		//Get all teams
//		try {
//			List<Team> teamList = teamDAO.getAllTeams();
//			if(teamList != null && teamList.size()>0) {
//				System.out.println("Total team size is "+teamList.size());
//				for (Team team : teamList) {
//					System.out.println(team);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		//Get teams by name
//		try {
//			List<Team> teamList = teamDAO.getTeamsByName("Windies");
//			if(teamList != null && teamList.size()>0) {
//				System.out.println("Total team size is "+teamList.size());
//				for (Team team : teamList) {
//					System.out.println(team);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
	}
		
}
