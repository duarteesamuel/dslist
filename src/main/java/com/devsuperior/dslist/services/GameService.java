package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	public List<GameMinDTO> findAll(){
		/*Método para retornar uma lista de Game reduzida*/
		List<Game> result = gameRepository.findAll();
		//Transformando uma lista completa em uma lista reduzida de games
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
}
