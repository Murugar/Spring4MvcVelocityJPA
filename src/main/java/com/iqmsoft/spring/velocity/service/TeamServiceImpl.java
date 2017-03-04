package com.iqmsoft.spring.velocity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.spring.velocity.dao.TeamDAO;
import com.iqmsoft.spring.velocity.model.Driver;
import com.iqmsoft.spring.velocity.model.Team;

@Service
public class TeamServiceImpl implements TeamService {
	
	private TeamDAO teamDAO;

	public void setTeamDAO(TeamDAO teamDAO) {
		this.teamDAO = teamDAO;
	}

	@Override
	@Transactional
	public void addTeam(Team t) {
		this.teamDAO.addTeam(t);
	}

	@Override
	@Transactional
	public void updateTeam(Team t) {
		this.teamDAO.updateTeam(t);
	}

	@Override
	@Transactional
	public List<Team> listTeams() {
		return this.teamDAO.listTeams();
	}

	@Override
	@Transactional
	public Team getTeamById(int id) {
		return this.teamDAO.getTeamById(id);
	}

	@Override
	@Transactional
	public void removeTeam(int id) {
		this.teamDAO.removeTeam(id);
	}

	@Override
	@Transactional
	public List<Driver> listDriversById(int id) {
		return this.teamDAO.listTeamsDriversById(id);
	}



} 