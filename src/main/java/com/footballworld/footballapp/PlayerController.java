package com.footballworld.footballapp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.footballworld.entities.Managers;
import com.footballworld.entities.Players;
import com.footballworld.service.PlayerService;

@RestController
@RequestMapping(value="/players")
public class PlayerController {
	
	private PlayerService playerService;
    
	@Autowired(required = true)
	@Qualifier(value = "playerService")
	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/JSON")
	public Players getPlayerId(@PathVariable("id") int id) {

		Players p = (Players) this.playerService.getPlayerById(id);
		//Optional<Players> playerOptional =  Optional.of(p);
		
		
		return p;
		// return "redirect:/managers";
	}

}
