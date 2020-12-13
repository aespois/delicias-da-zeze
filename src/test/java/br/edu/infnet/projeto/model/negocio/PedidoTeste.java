package br.edu.infnet.projeto.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PedidoTeste {

	@Test
	void testaAssociacao() {
		Cliente cliente = new Cliente("Ana", "Jaconé", "98856-1486");
		
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		
		assertTrue(cliente.equals(pedido.getCliente()));
	}
	
	@Test
	void testaInternet() {
		Cliente cliente = new Cliente("Ana", "Jaconé", "98856-1486");
		
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);

		assertTrue(pedido.isEntrega());
	}
	
	@Test
	void testaBalcao() {
		Cliente cliente = new Cliente("Ana", "Jaconé", "98856-1486");
		
		Pedido pedido = new Pedido();
		pedido.setEntrega(Boolean.FALSE);
		pedido.setCliente(cliente);

		assertFalse(pedido.isEntrega());
	}
	
	@Test
	void testaToString() {
		Cliente cliente = new Cliente("Ana", "Jaconé", "98856-1486");
		
		Pedido pedido = new Pedido();
		pedido.setEntrega(Boolean.FALSE);
		pedido.setCliente(cliente);

		DateTimeFormatter formatoHoje = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime hoje = LocalDateTime.now();
		
		String textoPedido = hoje.format(formatoHoje)+";false;Ana;Jaconé;98856-1486";

		assertTrue(textoPedido.equals(pedido.toString()));
	}
}