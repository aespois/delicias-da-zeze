package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//import br.edu.infnet.appLanchonete.model.exception.MedidaInvalidaException;

@SpringBootTest
public class TortasTeste {
	@Test
	//void testaInstanciaToString() throws MedidaInvalidaException {
	void testaInstanciaToString() {
		Tortas tortas = new Tortas("Tortinha", "Torta pequena de Brigadeiro", 7);
		tortas.setTipo("M");
		tortas.setSabor("Brigadeiro");
		
		assertTrue("Tortinha;Torta pequena de Brigadeiro;7.0;M;Brigadeiro".equals(tortas.toString()));		
	}
	
	@Test
	//void testaCalculoValor() throws MedidaInvalidaException {
	void testaCalculoValor() {
		Tortas tortas = new Tortas("Tortinha", "Torta pequena de Brigadeiro", 7);
		tortas.setTipo("M");
		tortas.setSabor("Brigadeiro");
		
		assertEquals(tortas.calcularValorVenda(), 12);
	}
	
	@Test
	void testaMedidaInvalida() {
		//try {
			Tortas tortas = new Tortas("Tortinha", "Torta pequena de Brigadeiro", 7);
			tortas.setTipo("M");
			tortas.setSabor("Brigadeiro");
			
		//} catch (MedidaInvalidaException e) {
			//assertEquals("Medida inválida.", e.getMessage());
		//}
	}
	
	@Test
	//void testaObterValorPorProduto() throws MedidaInvalidaException {
	void testaObterValorPorProduto() {
		Tortas tortas = new Tortas("Tortinha", "Torta pequena de Brigadeiro", 7);
		tortas.setTipo("M");
		tortas.setSabor("Brigadeiro");
		
		String result = "Tortinha;12.0\r";
		
		assertEquals(tortas.obterValorPorProduto(), result);
	}
}