package com.trose.GameAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trose.GameAPI.model.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
	
	Game findByTitle(String title);
	
	Game findById(long id);
	
	

}
