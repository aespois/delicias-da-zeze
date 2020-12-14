package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.projeto.model.exception.TamanhoInvalidoException;

@SpringBootTest
public class EmpadasTeste {

	@Test
	void testaInstanciaToString() throws TamanhoInvalidoException {
		Empadas empadas = new Empadas("Empadão", "Empadão com recheio de frango", 5);
		empadas.setTamanho("G");
		empadas.setRecheio("Frango");
		
		assertTrue("Empadão;Empadão com recheio de frango;5.0;G;Frango".equals(empadas.toString()));		
	}
	
	@Test
	void testaCalculoValor() throws TamanhoInvalidoException {
		Empadas empadas = new Empadas("Empadão", "Empadão com recheio de frango", 5);
		empadas.setTamanho("G");
		empadas.setRecheio("Frango");
		
		assertEquals(empadas.calcularValorVenda(), 15);
	}
	
	@Test
	void testaTamanhoInvalido() {
		try {
			Empadas empadas = new Empadas("Empadão", "Empadão com recheio de frango", 5);
			empadas.setTamanho("Grande");
			empadas.setRecheio("Frango");
		} catch (TamanhoInvalidoException e) {
			assertEquals("Tamanho Inválido", e.getMessage());
		}
	}
	
	@Test
	void testaObterValorPorProduto() throws TamanhoInvalidoException {
		Empadas empadas = new Empadas("Empadão", "Empadão com recheio de frango", 5);
		empadas.setTamanho("G");
		empadas.setRecheio("Frango");
		
		String result = "Empadão;15.0\r";
		
		assertEquals(empadas.obterValorPorProduto(), result);
	}
}