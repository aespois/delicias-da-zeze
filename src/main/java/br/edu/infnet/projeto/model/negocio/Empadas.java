package br.edu.infnet.projeto.model.negocio;

import br.edu.infnet.projeto.model.exception.TamanhoInvalidoException;

public class Empadas extends Produto {
	private String tamanho; // P, M ou G
	private String recheio; // frango, frango com catupiry e de camarão
	
	public Empadas(String nome, String descricao, float valorUnitario) {
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
		if (this.getTamanho() == "P") { // sem adição de valor
			return this.getValorUnitario();
		} else if (this.getTamanho() == "M") { // + R$ 5
			return this.getValorUnitario() + 5.0f;
		} else { // + R$ 10
			return this.getValorUnitario() + 10.0f;
		}
	}

	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) throws TamanhoInvalidoException {
		if(tamanho.length() > 1) {
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