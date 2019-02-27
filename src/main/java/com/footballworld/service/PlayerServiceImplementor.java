package com.footballworld.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.footballworld.dao.PlayerDao;
import com.footballworld.entities.Players;

@Service
public class PlayerServiceImplementor implements PlayerService {
   
	private PlayerDao playerDao;


	public void setPlayerDao(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}

	
	@Override
	@Transactional
	public Players getPlayerById(int id) {
		// TODO Auto-generated method stub
		return this.playerDao.getPlayerById(id);
	}

	@Override
	@Transactional
	public List<Players> getAllPlayers() {
		// TODO Auto-generated method stub
		return this.playerDao.getAllPlayers();
	}

	@Override
	@Transactional
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void updatePlayerData(Players p) {
		// TODO Auto-generated method stub

	}

	
	

}
