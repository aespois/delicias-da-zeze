package br.edu.infnet.projeto.model.negocio;

import java.util.Arrays;

import br.edu.infnet.projeto.model.exception.TipoInvalidoException;

public class Torta extends Produto {
	private String tipo; // Fatia, Tortinha ou Torta
	private String sabor; // brigadeiro, chocolate a 4 leites, chocolate com amendoim, chocolate com doce de leite, abacaxi com côco, doce de leite com ameixa, morango
	
	public Torta(String nome, String descricao, float valorUnitario) {
		super(nome, descricao, valorUnitario);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getTipo());
		sb.append(";");
		sb.append(this.getSabor());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
		String[] tipoTorta = {"Fatia", "Tortinha", "Torta"};
		float valorVenda = 0;
		
		if(Arrays.asList(tipoTorta).contains(this.getTipo())) {
			switch (this.getTipo()) {
			case "Fatia":
				valorVenda =  this.getValorUnitario();
			case "Tortinha":
				valorVenda =  this.getValorUnitario() + 5.0f;
			case "Torta":
				valorVenda = this.getValorUnitario() + 10.0f;
			}		
		} 
		return valorVenda;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) throws TipoInvalidoException {
		
		if (!tipo.equalsIgnoreCase("Fatia") && !tipo.equalsIgnoreCase("Tortinha") && !tipo.equalsIgnoreCase("Torta")) {
			throw new TipoInvalidoException("Tipo Inválido");
		}
		this.tipo = tipo;		
	}

	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}