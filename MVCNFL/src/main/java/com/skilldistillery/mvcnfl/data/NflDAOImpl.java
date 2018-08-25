package com.skilldistillery.mvcnfl.data;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.nfl.entities.Roster;

@Transactional
@Component
public class NflDAOImpl implements NflDAO{
	
	private final String fullQuery = "SELECT r FROM Roster r";
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Roster show(int id) {
		return em.find(Roster.class, id);
	}
	
	@Override
	public List<Roster> index() {

		return em.createQuery(fullQuery, Roster.class).getResultList();
	}

	@Override
	public Roster addNewPlayer(Roster player) {
		em.persist(player);
		em.flush();
		
		return player;
	}

	@Override
	public List<Roster> listTeam(String teamName) {
		return em.createQuery("Select r FROM Roster r WHERE r.teamName = :inputName", Roster.class)
				.setParameter("inputName", teamName)
				.getResultList();
	}

	@Override
	public Roster updatePlayer(Roster rost) {
		Roster updatedPlayer = em.find(Roster.class, rost.getId());
		updatedPlayer.setTeamName(rost.getTeamName());
		updatedPlayer.setFirstName(rost.getFirstName());
		updatedPlayer.setLastName(rost.getLastName());
		updatedPlayer.setPlayerNumber(rost.getPlayerNumber());
		updatedPlayer.setAge(rost.getAge());
		updatedPlayer.setHeight(rost.getHeight());
		updatedPlayer.setWeight(rost.getWeight());
		return updatedPlayer;
	}

	@Override
	public boolean deletePlayer(int id) {
		Roster r =em.find(Roster.class, id);
		em.remove(r);
		
		return em.find(Roster.class, id) == null;
	}
	

}


