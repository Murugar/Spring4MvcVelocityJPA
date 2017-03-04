package com.iqmsoft.spring.velocity.dao;

import java.util.List;

import com.iqmsoft.spring.velocity.model.Driver;
import com.iqmsoft.spring.velocity.model.Team;

public interface TeamDAO {

	public void addTeam(Team t);
	public void updateTeam(Team t);
	public List<Team> listTeams();
	public Team getTeamById(int id);
	public void removeTeam(int id);
	public List<Driver> listTeamsDriversById(int id);
} 