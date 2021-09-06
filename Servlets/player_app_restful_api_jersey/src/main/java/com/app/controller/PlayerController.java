package com.app.controller;





import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.model.Player;
import com.app.service.PlayerService;
import com.app.service.impl.PlayerServiceImpl;


@Path("/players")
public class PlayerController {
	
	private PlayerService service = new PlayerServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Player createPlayer(Player player) {
		
		return service.createPlayer(player);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Player updatePlayer(Player player) {
		
		return service.updatePlayer(player);
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Player getPlayerById(@PathParam("id") int id) {
		return service.getPlayerById(id);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deletePlayerById(@PathParam("id") int id) {
		service.deletePlayerById(id);
		
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Player> getAllPlayers() {
		
		return service.getAllPlayers();
	}

	@GET
	@Path("/teamName/{teamName}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Player> getAllPlayersByTeamName(@PathParam("teamName")String teamName) {
		
		return service.getAllPlayersByTeamName(teamName);
	}


}
