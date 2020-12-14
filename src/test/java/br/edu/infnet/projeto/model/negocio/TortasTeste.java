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
		Tortas tortas = new Tortas("Fatia", "Fatia de Torta de Brigadeiro", 7);
		tortas.setTipo("Fatia");
		tortas.setSabor("Brigadeiro");
		
		assertTrue("Fatia;Fatia de Torta de Brigadeiro;7.0;Fatia;Brigadeiro".equals(tortas.toString()));		
	}
	
	@Test
	//void testaCalculoValor() throws MedidaInvalidaException {
	void testaCalculoValor() {
		Tortas tortas = new Tortas("Fatia", "Fatia de Torta de Brigadeiro", 7);
		tortas.setTipo("Fatia");
		tortas.setSabor("Brigadeiro");
		
		assertEquals(tortas.calcularValorVenda(), 7);
	}
	
	@Test
	void testaMedidaInvalida() {
		//try {
			Tortas tortas = new Tortas("Fatia", "Fatia de Torta de Brigadeiro", 7);
			tortas.setTipo("Fatia");
			tortas.setSabor("Brigadeiro");
			
		//} catch (MedidaInvalidaException e) {
			//assertEquals("Medida inválida.", e.getMessage());
		//}
	}
	
	@Test
	//void testaObterValorPorProduto() throws MedidaInvalidaException {
	void testaObterValorPorProduto() {
		Tortas tortas = new Tortas("Fatia", "Fatia de Torta de Brigadeiro", 7);
		tortas.setTipo("Fatia");
		tortas.setSabor("Brigadeiro");
		
		String result = "Fatia;7.0\r";
		
		assertEquals(tortas.obterValorPorProduto(), result);
	}
}