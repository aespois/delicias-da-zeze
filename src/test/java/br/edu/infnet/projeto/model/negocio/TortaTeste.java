package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.projeto.model.exception.TipoInvalidoException;

@SpringBootTest
public class TortaTeste {
	@Test
	void testaInstanciaToString() throws TipoInvalidoException {
		Torta tortas = new Torta("Tortinha", "Torta pequena de Brigadeiro", 7);
		tortas.setTipo("Tortinha");
		tortas.setSabor("Brigadeiro");
		
		assertTrue("Tortinha;Torta pequena de Brigadeiro;7.0;Tortinha;Brigadeiro".equals(tortas.toString()));		
	}
	
	@Test
	void testaCalculoValor() throws TipoInvalidoException {
		Torta tortas = new Torta("Torta", "Torta grande de Brigadeiro", 7);
		tortas.setTipo("Torta");
		tortas.setSabor("Brigadeiro");
		
		assertEquals(tortas.calcularValorVenda(), 17);
	}
	
	@Test
	void testaObterValorPorProduto() throws TipoInvalidoException {
		Torta tortas = new Torta("Torta", "Torta pequena de Brigadeiro", 7);
		tortas.setTipo("Torta");
		tortas.setSabor("Brigadeiro");
		
		String result = "Torta;17.0\r";
		
		assertEquals(tortas.obterValorPorProduto(), result);
	}
}