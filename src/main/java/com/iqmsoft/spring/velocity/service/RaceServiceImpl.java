package com.iqmsoft.spring.velocity.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.spring.velocity.dao.RaceDAO;
import com.iqmsoft.spring.velocity.model.Race;

@Service
public class RaceServiceImpl implements RaceService {
	
	private RaceDAO raceDAO;

	public void setRaceDAO(RaceDAO raceDAO) {
		this.raceDAO = raceDAO;
	}

	@Override
	@Transactional
	public void addRace(Race r) {
		this.raceDAO.addRace(r);
	}

	@Override
	@Transactional
	public void updateRace(Race r) {
		this.raceDAO.updateRace(r);
	}

	@Override
	@Transactional
	public List<Race> listRaces() {
		return this.raceDAO.listRaces();
	}

	@Override
	@Transactional
	public Race getRaceById(int id) {
		return this.raceDAO.getRaceById(id);
	}

	@Override
	@Transactional
	public void removeRace(int id) {
		this.raceDAO.removeRace(id);
	}




} 