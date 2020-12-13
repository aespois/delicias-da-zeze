package br.edu.infnet.projeto.model.negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

	private LocalDateTime data;
	private boolean entrega;
	private Cliente cliente;
	
	public Pedido() {
		this.data = LocalDateTime.now();
		this.entrega = Boolean.TRUE;
	}
	
	@Override
	public String toString() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s", 
				this.getData().format(formatter), 
				this.isEntrega(), 
				this.cliente.toString()
			);
	}

	public LocalDateTime getData() {
		return data;
	}
	public boolean isEntrega() {
		return entrega;
	}
	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
