package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadesController {
	
	
	@GetMapping("/habilidades")
	public String digaOla(){
		return "<b>Mentalidades:</b><br>Orientação ao futuro<br>Responsabilidade pessoal<br>Mentalidade de crescimento<br>"
				+ "Persistência<br><br><b>Habilidades:</b><br>Trabalho em equipe<br>Atenção aos detalhes<br>Proatividade<br>"
				+ "Comunicação";
	}	
	
	

}
