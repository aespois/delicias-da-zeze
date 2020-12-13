package br.edu.infnet.projeto.model.negocio;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//import br.edu.infnet.appLanchonete.model.exception.MedidaInvalidaException;

@SpringBootTest
public class SaladaFrutasTeste {
	// tamanho e recheio
	@Test
	//void testaInstanciaToString() throws MedidaInvalidaException {
	void testaInstanciaToString() {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setRetirarFruta("Banana");
		
		assertTrue("Salada de Frutas;Frutas selecionadas: banana, uva, manga, morango, mamão;5.0;true;Banana".equals(saladaFrutas.toString()));		
	}
	
	@Test
	//void testaCalculoValor() throws MedidaInvalidaException {
	void testaCalculoValor() {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setRetirarFruta("Banana");
		
		//assertEquals(saladaFrutas.calcularValorVenda(), 11);
	}
	
	@Test
	void testaMedidaInvalida() {
		//try {
			SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
			saladaFrutas.setMel(Boolean.TRUE);
			saladaFrutas.setRetirarFruta("Banana");
			
		//} catch (MedidaInvalidaException e) {
			//assertEquals("Medida inválida.", e.getMessage());
		//}
	}
	
	@Test
	//void testaObterValorPorProduto() throws MedidaInvalidaException {
	void testaObterValorPorProduto() {
		SaladaFrutas saladaFrutas = new SaladaFrutas("Salada de Frutas", "Frutas selecionadas: banana, uva, manga, morango, mamão", 5);
		saladaFrutas.setMel(Boolean.TRUE);
		saladaFrutas.setRetirarFruta("Banana");
		
		//String result = "suco;11.0\r";
		
		//assertEquals(saladaFrutas.obterValorPorProduto(), result);
	}
}