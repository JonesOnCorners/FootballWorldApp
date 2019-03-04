package com.footballworld.footballapp;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.PropertyAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.footballworld.entities.Managers;
import com.footballworld.entities.Players;
import com.footballworld.exceptions.ErrorResponse;
import com.footballworld.exceptions.PlayerNotFound;
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
	public ResponseEntity<Players> getPlayerId(@PathVariable("id") int id) throws PlayerNotFound{

		Players p = (Players) this.playerService.getPlayerById(id);
		//Optional<Players> playerOptional =  Optional.of(p);
		System.out.println(p.getPlayerId());
		
		if(p.getPlayerId() <=0)
		{
			throw new PlayerNotFound("Player not found");
		}
		
		return new ResponseEntity<Players>(p, HttpStatus.OK);
		// return "redirect:/managers";
	}
	
	/*
	 * @ExceptionHandler({PlayerNotFound.class,ObjectNotFoundException.class,
	 * NullPointerException.class}) public ResponseEntity<ErrorResponse>
	 * exceptionHandler(Exception ex) { ErrorResponse error = new ErrorResponse();
	 * error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());
	 * error.setMessage("Player deoesn't exist"); return new
	 * ResponseEntity<ErrorResponse>(error, HttpStatus.OK); }
	 * 
	 * @ExceptionHandler({Exception.class}) public ResponseEntity<ErrorResponse>
	 * nullExceptionHandler(Exception ex) { ErrorResponse error = new
	 * ErrorResponse(); error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());
	 * error.setMessage("Null Pointer Error"); return new
	 * ResponseEntity<ErrorResponse>(error, HttpStatus.OK); }
	 */

}
