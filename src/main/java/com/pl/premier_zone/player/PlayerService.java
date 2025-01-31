package com.pl.premier_zone.player;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class PlayerService {

	private final PlayerRepository playerRepository;

	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public List<Player> getPlayers() {
		return playerRepository.findAll();
	}

	public List<Player> getPlayersFromTeam(String teamName) {
		return playerRepository.findAll().stream().filter(player -> teamName.equals(player.getTeam()))
				.collect(Collectors.toList());
	}

	public List<Player> getPlayerByName(String searchText) {
		return playerRepository.findAll().stream()
				.filter(player -> player.getName().toLowerCase().contains(searchText.toLowerCase()))
				.collect(Collectors.toList());
	}

	public List<Player> getPlayerByPos(String searchText) {
		return playerRepository.findAll().stream()
				.filter(player -> player.getPos().toLowerCase().contains(searchText.toLowerCase()))
				.collect(Collectors.toList());
	}

	public List<Player> getPlayersByNation(String searchText) {
		return playerRepository.findAll().stream()
				.filter(player -> player.getNation().toLowerCase().contains(searchText.toLowerCase()))
				.collect(Collectors.toList());
	}

}
