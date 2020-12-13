package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTeste { 
	@Test
	void testaEmpadas() {
		Empadas empadas = null;
		
		empadas = new Empadas("Empadão", "Empadão com recheio de frango", 15); 
		
		assertNotNull(empadas);
	}
	
	@Test
	void testaSaladaFrutas() {
		SaladaFrutas saladaFrutas = null;
		
		saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		
		assertNotNull(saladaFrutas);
	}
	
	@Test
	void testaTortas() {
		Tortas tortas = null;
		
		tortas = new Tortas("Fatia", "Fatia de Torta de Brigadeiro", 7);
		
		assertNotNull(tortas);
	}
}