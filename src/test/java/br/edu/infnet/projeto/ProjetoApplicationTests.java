package br.edu.infnet.projeto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjetoApplicationTests {

	@Test
	void teste01() {
		ProjetoApplication.main(new String[] {"Espois"});
	}

}
