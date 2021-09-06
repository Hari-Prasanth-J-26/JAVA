package com.revature;

import java.util.List;


import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.crud.service.PlayerCRUDService;
import com.revature.crud.service.impl.PlayerCRUDServiceImpl;
import com.revature.exceptions.BusinessException;
import com.revature.model.Player;
import com.revature.search.service.PlayerSearchService;
import com.revature.search.service.impl.PlayerSearchServiceImpl;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		log.info("Welcome to Hari's Player App");
		log.info("===================================");

		int ch = 0;
		do {
			log.info("\nWhat you wish to do today?");
			log.info("1)Create a player");
			log.info("2)Update a player");
			log.info("3)Delete a player");
			log.info("4)List all players");
			log.info("5)Search the players with filters");
			log.info("6)EXIT");
			log.info("Please enter your choice 1-6 only");

			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				log.error(e);
			}

		
				log.info("Create a player");
				PlayerCRUDService playerCURDService = new PlayerCRUDServiceImpl();

				switch (ch) {
				case 1:
					int id2 = 0;
					int age2 = 0;
					String name2 = null;
					String gender2 = null;
					String city2 = null;
					String sportsName2 = null;
					long contact2 = 0l;
					int teamId2 = 0;
					log.info("Enter Player Id");
					try {
						id2 = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
					log.error(e);
					}
					log.info("Enter Player name");
					try {
						name2 = sc.nextLine();
					} catch (NumberFormatException e) {
					log.error(e);
					}
					log.info("Enter Player age");
					try {
						age2 = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
					log.error(e);
					}
					log.info("Enter Player gender");
					try {
						gender2 = sc.nextLine();
					} catch (NumberFormatException e) {
					log.error(e);
					}
					log.info("Enter Player city");
					try {
						city2 = sc.nextLine();
					} catch (NumberFormatException e) {
					
					log.error(e);
					}
					log.info("Enter Player sports name");
					try {
						sportsName2 = sc.nextLine();
					} catch (NumberFormatException e) {
					log.error(e);
					}
					log.info("Enter Player contact");
					try {
						contact2 = Long.parseLong(sc.nextLine());
					} catch (NumberFormatException e) {
						
						log.error(e);
					}
					log.info("1)India");
					log.info("5)Windies");
					log.info("6)RCB");
					log.info("7)MI");
					log.info("8)CSK");
					log.info("Enter Player team Id");
					try {
						teamId2 = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
					
						log.error(e);
					}
					Player player = new Player(id2, name2, age2, city2, gender2, sportsName2, contact2, teamId2);
					try {
						if (playerCURDService.createPlayer(player) == 1) {
							log.info("Player created with below details successfully");
							log.info(player);
						}
					} catch (BusinessException e) {
						log.info(e.getMessage());
					}

					
				break;
			case 2:
				log.info("Under construction");
				break;
			case 3:
				log.info("Under construction");
				break;
			case 4:
				log.info("Under construction");
				break;
			case 5:
				int option = 0;
				PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
				do {
					log.info("\n\nWelcome to players search menu... Search the player by using the below filters");
					log.info("1. By player Id");
					log.info("2. By player Name");
					log.info("3. By player Age");
					log.info("4. By player Gender");
					log.info("5. By player City");
					log.info("6. By player Sports Name");
					log.info("7. By player Contact");
					log.info("8. By player Team Name");
					log.info("9. Go back to Main menu");
					log.info("Please enter your choice 1-9 only");

					try {
						option = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
					}

					switch (option) {
					case 1:
						log.info("Enter player id to get the player details");
						try {
							int id = Integer.parseInt(sc.nextLine());
							Player player1 = playerSearchService.getPlayerById(id);
							if (player1 != null) {
								log.info("Enterd player id " + id + " is found successfully");
								log.info(player1);
							}
						} catch (NumberFormatException e) {
							log.warn("Player id should be digit only...");
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 2:
						log.info("Enter the player name to get the details");
						String name = sc.nextLine();
						try {
							List<Player> playerList = playerSearchService.getPlayersByName(name);
							if(playerList!=null && playerList.size()>0) {
								log.info("Total there are "+playerList.size()+" players under this name "+name);
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 3:
						log.info("Enter the player age to get the player details");
						int age = Integer.parseInt(sc.nextLine());
						try {
							List<Player> playerList = playerSearchService.getPlayersByAge(age);
							if(playerList!=null && playerList.size()>0) {
								log.info("Total there are "+playerList.size()+" players greater than this age "+age);
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 4:
						log.info("Enter the player gender to get those player details");
						String gender = sc.nextLine();
						try {
							List<Player> playerList = playerSearchService.getPlayersByGender(gender);
							if(playerList!=null && playerList.size()>0) {
								log.info("Total there are "+playerList.size()+" players under this gender "+gender.toUpperCase());
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 5:
						log.info("Enter the city name to get the player details on that city");
						String city = sc.nextLine();
						try {
							List<Player> playerList = playerSearchService.getPlayersByCity(city);
							if(playerList!=null && playerList.size()>0) {
								log.info("Total there are "+playerList.size()+" players under this city "+city);
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 6:
						log.info("Enter the sports name to get player details");
						String sportsName = sc.nextLine();
						try {
							List<Player> playerList = playerSearchService.getPlayersBySportsName(sportsName);
							if(playerList!=null && playerList.size()>0) {
								log.info("Total there are "+playerList.size()+" players under this sports name "+sportsName);
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 7:
						log.info("Enter the player contact to find those player details");
						try {
							long contact = Long.parseLong(sc.nextLine());
							Player player1 = playerSearchService.getPlayerByContact(contact);
							if (player1 != null) {
								log.info("Enterd player contact" + contact + " is found successfully");
								log.info(player1);
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 8:
						log.info("Enter the team name to get the player detials for that team");
						String teamName = sc.nextLine();
						try {
							List<Player> playerList = playerSearchService.getPlayersByTeamName(teamName);
							if(playerList!=null && playerList.size()>0) {
								log.info("Total there are "+playerList.size()+" players for this team "+teamName.toUpperCase());
								for (Player player1 : playerList) {
									log.info(player1);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 9:
						log.info("\n\nGoing back to the Main menu\n\n");
						break;

					default:
						log.warn("Invalid Search Option.... Choice should be numbers and 1-9 only.. kindly retry");
						break;
					}
				} while (option != 9);
				break;
			case 6:
				log.info("Thanks for using this APP :) ");
				break;
			default:
				log.warn("Invalid choise.... Choice should be numbers and 1-6 only");
				break;
				}
			} while (ch != 6);

		
	
	}

}
