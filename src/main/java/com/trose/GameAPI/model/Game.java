package com.trose.GameAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "games")
@Entity
public class Game {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;

	private String title;
	
	@Column(name="release_year")
	private int year;
	
	private String genre;
	

}
