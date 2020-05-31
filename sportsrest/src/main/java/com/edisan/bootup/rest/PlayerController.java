package com.edisan.bootup.rest;

import com.edisan.bootup.model.Player;
import com.edisan.bootup.sportsdata.SportsDataRESTService;
import com.edisan.bootup.sportsdata.model.SDPlayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@GetMapping("/player")
	public Player getPlayer(@RequestParam(value = "id", defaultValue = "20002497") String id) {
		SportsDataRESTService sports = new SportsDataRESTService();
		SDPlayer sdPlayer = sports.getPlayer(new Long(id));
		
		Player player = null;
		if (sdPlayer != null) {
			player = new Player(sdPlayer.getPlayerID(),
				sdPlayer.getFirstName(),
				sdPlayer.getLastName(),
				sdPlayer.getTeamID(),
				sdPlayer.getTeam(),
				sdPlayer.getPosition(),
				sdPlayer.getCollege(),
				sdPlayer.getPhotoUrl());
		}
		else {
			player = Player.NULL_PLAYER;
		}
		
		return player;
	}
}
