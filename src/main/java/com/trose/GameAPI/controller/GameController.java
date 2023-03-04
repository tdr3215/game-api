package com.trose.GameAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trose.GameAPI.model.Game;
import com.trose.GameAPI.service.GameService;

@RestController(value="/api")
public class GameController {
	
	@Autowired
	GameService gameService;
	
	@GetMapping("/games")
	ResponseEntity<List<Game>> getGames(){
		List<Game> result = gameService.findAll();
		return new ResponseEntity<>(result,HttpStatus.OK);
		
	}
	
	
}
