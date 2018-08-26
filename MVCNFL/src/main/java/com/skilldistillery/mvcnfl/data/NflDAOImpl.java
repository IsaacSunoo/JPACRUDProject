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
	public Roster show(Integer id) {
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
	public Roster updatePlayer(Roster player) {
		Roster updatedPlayer = em.find(Roster.class, player.getId());
		updatedPlayer.setTeamName(player.getTeamName());
		updatedPlayer.setFirstName(player.getFirstName());
		updatedPlayer.setLastName(player.getLastName());
		updatedPlayer.setPosition(player.getPosition());
		updatedPlayer.setPlayerNumber(player.getPlayerNumber());
		updatedPlayer.setAge(player.getAge());
		updatedPlayer.setHeight(player.getHeight());
		updatedPlayer.setWeight(player.getWeight());
		return updatedPlayer;
	}

	@Override
	public boolean deletePlayer(Integer id) {
		Roster r =em.find(Roster.class, id);
		em.remove(r);
		
		return em.find(Roster.class, id) == null;
	}
	

}


