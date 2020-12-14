package br.edu.infnet.projeto.model.negocio;

//import br.edu.infnet.appLanchonete.model.exception.MedidaInvalidaException;

public class Tortas extends Produto {
	private String tipo; // Fatia, Tortinha ou Torta
	private String sabor; // brigadeiro, chocolate a 4 leites, chocolate com amendoim, chocolate com doce de leite, abacaxi com côco, doce de leite com ameixa, morango
	
	public Tortas(String nome, String descricao, float valorUnitario) {
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
		//
	}

	public String getTipo() {
		return tipo;
	}
	
	//public void setMedida(float medida) throws MedidaInvalidaException {
	public void setTipo(String tipo) {
		
		//if(medida <= 0) {
		//	throw new MedidaInvalidaException("Medida inválida.");
		//}
		
		this.tipo = tipo;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}