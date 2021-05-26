package com.example.segundaAplicacao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		
public class Objetivos {
	@GetMapping("/objetivos")
	public String objetivos() {
	
	return "<b>Objetivos:</b><br>Construir uma aplicação web spring<br> Fazer a comunicação com o banco de dados "
			+ "<br>Lançar uma versão final da aplicação web spring";
	}
	
}
