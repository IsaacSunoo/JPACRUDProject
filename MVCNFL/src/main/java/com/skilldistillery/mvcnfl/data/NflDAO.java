package com.skilldistillery.mvcnfl.data;

import java.util.List;

import com.skilldistillery.nfl.entities.Roster;

public interface NflDAO {

	public Roster show(Integer id);

	public List<Roster> index();
	
	public List<Roster> listTeam(String teamName);

	public Roster addNewPlayer(Roster rost);
	
	public Roster updatePlayer(Integer id, Roster rost);
	
	public boolean deletePlayer(Integer id);

	

}
