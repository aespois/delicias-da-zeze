package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.projeto.model.exception.ComplementoInvalidoException;

@SpringBootTest
public class SaladaFrutasTeste {
	@Test
	void testaInstanciaToString() throws ComplementoInvalidoException {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setComplemento("Banana");
		
		assertTrue("Salada de Frutas;Frutas selecionadas: banana, uva, manga, morango, mamão;5.0;true;Banana".equals(saladaFrutas.toString()));		
	}
	
	@Test
	void testaCalculoValor() throws ComplementoInvalidoException {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setComplemento("Banana");
		
		assertEquals(saladaFrutas.calcularValorVenda(), 7);
	}
	
	@Test
	void testaObterValorPorProduto() throws ComplementoInvalidoException {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setComplemento("Banana");
		
		String result = "Salada de Frutas;7.0\r";
		
		assertEquals(saladaFrutas.obterValorPorProduto(), result);
	}
}