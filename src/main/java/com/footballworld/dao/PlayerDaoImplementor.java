package com.footballworld.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.footballworld.entities.Players;

@Repository
public class PlayerDaoImplementor implements PlayerDao {

	private final static Logger logger = LoggerFactory.getLogger(PlayerDaoImplementor.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Players getPlayerById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Players p = (Players) session.load(Players.class, new Integer(id));
		return p;
	}

	@Override
	public List<Players> getAllPlayers() {
		// TODO Auto-generated method stub
		Session session =  this.sessionFactory.openSession();
		List<Players> playerList = session.createQuery("from Players").list();
		return playerList;		
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePlayerData(Players p) {
		// TODO Auto-generated method stub

	}

}
