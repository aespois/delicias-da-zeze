package br.edu.infnet.projeto.model.negocio;

import java.util.Arrays;

import br.edu.infnet.projeto.model.exception.TamanhoInvalidoException;
import br.edu.infnet.projeto.model.exception.TipoInvalidoException;

public class Empada extends Produto {
	private String tamanho; // P, M ou G
	private String recheio; // frango, frango com catupiry e de camarão
	
	public Empada(String nome, String descricao, float valorUnitario) {
		super(nome, descricao, valorUnitario);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getTamanho());
		sb.append(";");
		sb.append(this.getRecheio());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() { 
		String[] tamanhoEmpada = {"P", "M", "G"};
		float valorVenda = 0;
		
		if(Arrays.asList(tamanhoEmpada).contains(this.getTamanho())) {
			switch (this.getTamanho()) {
			case "P":
				valorVenda =  this.getValorUnitario();
			case "M":
				valorVenda =  this.getValorUnitario() + 5.0f;
			case "G":
				valorVenda = this.getValorUnitario() + 10.0f;
			}		
		} 
		return valorVenda;
	}

	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) throws TamanhoInvalidoException {
		if (!tamanho.equalsIgnoreCase("P") && !tamanho.equalsIgnoreCase("M") && !tamanho.equalsIgnoreCase("G")) {
			throw new TamanhoInvalidoException("Tamanho Inválido");
		}
		this.tamanho = tamanho;
	}
	
	public String getRecheio() {
		return recheio;
	}
	
	public void setRecheio(String recheio) {	
		this.recheio = recheio;
	}
}