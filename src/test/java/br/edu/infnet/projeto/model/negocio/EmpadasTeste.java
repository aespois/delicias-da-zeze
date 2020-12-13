package br.edu.infnet.projeto.model.negocio;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//import br.edu.infnet.appLanchonete.model.exception.MedidaInvalidaException;

@SpringBootTest
public class EmpadasTeste {
	// tamanho e recheio
	@Test
	//void testaInstanciaToString() throws MedidaInvalidaException {
	void testaInstanciaToString() {
		Empadas empadas = new Empadas("Empadão", "Empadão com recheio de frango", 15);
		empadas.setTamanho("G");
		empadas.setRecheio("Frango");
		
		assertTrue("Empadão;Empadão com recheio de frango;15.0;G;Frango".equals(empadas.toString()));		
	}
	
	@Test
	//void testaCalculoValor() throws MedidaInvalidaException {
	void testaCalculoValor() {
		Empadas empadas = new Empadas("Empadão", "Empadão com recheio de frango", 15);
		empadas.setTamanho("G");
		empadas.setRecheio("Frango");
		
		//assertEquals(empadas.calcularValorVenda(), 11);
	}
	
	@Test
	void testaMedidaInvalida() {
		//try {
			Empadas empadas = new Empadas("Empadão", "Empadão com recheio de frango", 15);
			empadas.setTamanho("G");
			empadas.setRecheio("Frango");
			
		//} catch (MedidaInvalidaException e) {
			//assertEquals("Medida inválida.", e.getMessage());
		//}
	}
	
	@Test
	//void testaObterValorPorProduto() throws MedidaInvalidaException {
	void testaObterValorPorProduto() {
		Empadas empadas = new Empadas("Empadão", "Empadão com recheio de frango", 15);
		empadas.setTamanho("G");
		empadas.setRecheio("Frango");
		
		//String result = "suco;11.0\r";
		
		//assertEquals(empadas.obterValorPorProduto(), result);
	}
}