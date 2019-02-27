package com.footballworld.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.footballworld.entities.Managers;

import java.util.Optional;

import java.util.List;

@Repository
public class ManagerDaoImpl implements ManagerDao {

	private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ManagerDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addManager(Managers m) {
		// TODO Auto-generated method stub

		logger.info("Inside add manager");

		Session session = this.sessionFactory.openSession();
		session.save(m);
		logger.info("Manager saved succesfully-->" + m);

	}

	public void deleteManager(int id) {
		// TODO Auto-generated method stub

	}

	public List<Managers> getAllManagers() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();

		List<Managers> managerList = session.createQuery("from Managers").list();

		logger.info("Retreived list-->" + managerList);

		return managerList;

	}

	public Managers getManagerById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Managers m = (Managers) session.load(Managers.class, new Integer(id));
		logger.info("Manager loaded successfully-->" + m);
		return m;
	}

}
