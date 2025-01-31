package com.pl.premier_zone.player;

import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

	private final PlayerService playerService;

	@Autowired
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}

	@GetMapping
	public List<Player> getPlayer(@RequestParam(required = false) String team,
			@RequestParam(required = false) String name, @RequestParam(required = false) String position,
			@RequestParam(required = false) String nation) {

		if (team != null && position != null) {
			return playerService.getPlayerByTeamAndPosition(team, position);
		} else if (team != null) {
			return playerService.getPlayersFromTeam(team);
		} else if (name != null) {
			return playerService.getPlayerByName(name);
		} else if (nation != null) {
			return playerService.getPlayersByNation(nation);
		} else {
			return playerService.getPlayers();
		}
	}

	@PostMapping
	public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
		Player createdPlayer = playerService.addPlayer(player);
		return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
		Player resultPlayer = playerService.updatePlayer(player);
		if (resultPlayer != null) {
			return new ResponseEntity<>(resultPlayer, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{playerName}")
	public ResponseEntity<String> deletePlayer(@PathVariable String name) {
		playerService.deletePlayer(name);

		return new ResponseEntity<>("player Deleted Successfully", HttpStatus.OK);
	}
}
