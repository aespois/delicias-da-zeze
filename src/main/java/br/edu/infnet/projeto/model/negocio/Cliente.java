package br.edu.infnet.projeto.model.negocio;

public class Cliente {
	private String nome;
	private String endereco;
	private String telefone;

	public Cliente(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getEndereco());
		sb.append(";");
		sb.append(this.getTelefone());
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}

}
