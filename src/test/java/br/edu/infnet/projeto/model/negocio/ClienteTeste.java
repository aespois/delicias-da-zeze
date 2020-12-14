package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTeste {
	@Test
	void testaInstancia() {
		Cliente s = null;
		
		s = new Cliente("Ana", "Jaconé", "98856-1486");
		
		assertNotNull(s);
	}
	
	@Test
	void testaToString() {
		Cliente s = null;
		
		s = new Cliente("Ana", "Jaconé", "98856-1486");

		assertTrue("Ana;Jaconé;98856-1486".equals(s.toString()));
	}
}
