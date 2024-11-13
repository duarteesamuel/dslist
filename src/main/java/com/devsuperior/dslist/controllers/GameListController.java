package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.services.GameListService;

/*Porta de entrada para o Back-End, disponibiliza a API para
  o front end*/

@RestController
@RequestMapping(value = "/lists") //Caminho de resposta da API
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
