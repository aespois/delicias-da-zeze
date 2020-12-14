package br.edu.infnet.projeto.model.negocio;

public abstract class Produto {

	private String nome;
	private String descricao;
	private float valorUnitario;
	
	public Produto(String nome, String descricao, float valorUnitario) {
		this.nome = nome;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	public abstract float calcularValorVenda();
	
	public String obterValorPorProduto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.calcularValorVenda());
		sb.append("\r");
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValorUnitario());
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public float getValorUnitario() {
		return valorUnitario;
	}

}