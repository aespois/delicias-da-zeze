package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTeste { 
	@Test
	void testaEmpadas() {
		Empada empadas = null;
		
		empadas = new Empada("Empadão", "Empadão com recheio de frango", 15); 
		
		assertNotNull(empadas);
	}
	
	@Test
	void testaSaladaFrutas() {
		SaladaFruta saladaFrutas = null;
		
		saladaFrutas = new SaladaFruta("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		
		assertNotNull(saladaFrutas);
	}
	
	@Test
	void testaTortas() {
		Torta tortas = null;
		
		tortas = new Torta("Fatia", "Fatia de Torta de Brigadeiro", 7);
		
		assertNotNull(tortas);
	}
}