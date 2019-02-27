package com.footballworld.service;

import java.util.List;

import com.footballworld.entities.Players;

public interface PlayerService {

	public Players getPlayerById(int id);

	public List<Players> getAllPlayers();

	public void deletePlayer(int id);

	public void updatePlayerData(Players p);

}
