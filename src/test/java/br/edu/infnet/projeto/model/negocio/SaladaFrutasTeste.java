package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SaladaFrutasTeste {
	@Test
	void testaInstanciaToString() {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setRetirarFruta("Banana");
		
		assertTrue("Salada de Frutas;Frutas selecionadas: banana, uva, manga, morango, mamão;5.0;true;Banana".equals(saladaFrutas.toString()));		
	}
	
	@Test
	void testaCalculoValor() {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setRetirarFruta("Banana");
		
		assertEquals(saladaFrutas.calcularValorVenda(), 7);
	}
	
	@Test
	void testaObterValorPorProduto() {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setRetirarFruta("Banana");
		
		String result = "Salada de Frutas;7.0\r";
		
		assertEquals(saladaFrutas.obterValorPorProduto(), result);
	}
}