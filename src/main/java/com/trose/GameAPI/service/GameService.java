package com.trose.GameAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trose.GameAPI.model.Game;
import com.trose.GameAPI.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	GameRepository gameRepository;
	
	public List<Game> findAll() {
		return gameRepository.findAll();
	}
	
	public Game findById(long id) {
		return gameRepository.findById(id);
	}
	
	public Game findByTitle(String title) {
		return gameRepository.findByTitle(title);
	}
}
