package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.projeto.model.exception.TipoInvalidoException;

@SpringBootTest
public class TortasTeste {
	@Test
	void testaInstanciaToString() throws TipoInvalidoException {
		Tortas tortas = new Tortas("Tortinha", "Torta pequena de Brigadeiro", 7);
		tortas.setTipo("M");
		tortas.setSabor("Brigadeiro");
		
		assertTrue("Tortinha;Torta pequena de Brigadeiro;7.0;M;Brigadeiro".equals(tortas.toString()));		
	}
	
	@Test
	void testaCalculoValor() throws TipoInvalidoException {
		Tortas tortas = new Tortas("Tortinha", "Torta pequena de Brigadeiro", 7);
		tortas.setTipo("M");
		tortas.setSabor("Brigadeiro");
		
		assertEquals(tortas.calcularValorVenda(), 12);
	}
	
	@Test
	void testaTipoInvalido() {
		try {
			Tortas tortas = new Tortas("Tortinha", "Torta pequena de Brigadeiro", 7);
			tortas.setTipo("Médio");
			tortas.setSabor("Brigadeiro");
			
		} catch (TipoInvalidoException e) {
			assertEquals("Tipo Inválido", e.getMessage());
		}
	}
	
	@Test
	void testaObterValorPorProduto() throws TipoInvalidoException {
		Tortas tortas = new Tortas("Tortinha", "Torta pequena de Brigadeiro", 7);
		tortas.setTipo("M");
		tortas.setSabor("Brigadeiro");
		
		String result = "Tortinha;12.0\r";
		
		assertEquals(tortas.obterValorPorProduto(), result);
	}
}