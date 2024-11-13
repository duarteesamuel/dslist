package com.devsuperior.dslist.repositories;

/*COMPONENTE PARA REALIZAR CONSULTAS NO BANCO DE DADOS*/

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
