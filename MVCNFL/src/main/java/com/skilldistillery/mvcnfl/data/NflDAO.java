package com.skilldistillery.mvcnfl.data;

import java.util.List;

import com.skilldistillery.nfl.entities.Roster;

public interface NflDAO {

	public Roster show(int id);

	public List<Roster> index();
	
	public List<Roster> listTeam(String teamName);

	public Roster addNewPlayer(Roster rost);
	
	public Roster updatePlayer(Roster rost);
	
	public boolean deletePlayer(int id);
	

}
