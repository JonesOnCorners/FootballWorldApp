package com.footballworld.dao;

import java.util.List;

import com.footballworld.entities.Players;

public interface PlayerDao {

	public Players getPlayerById(int id);

	public List<Players> getAllPlayers();

	public void deletePlayer(int id);

	public void updatePlayerData(Players p);

}
