package br.edu.infnet.projeto.model.negocio;

// import br.edu.infnet.appLanchonete.model.exception.MedidaInvalidaException;

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

	//@Override
	//public float calcularValorVenda() {
	//	return this.getValor() + (this.isProducaoPropria() ? 2 : 0) + this.getMedida() * 0.02f;
	//}

	public String getTamanho() {
		return tamanho;
	}
	
	//public void setMedida(float medida) throws MedidaInvalidaException {
	public void setTamanho(String tamanho) {
		
		//if(medida <= 0) {
		//	throw new MedidaInvalidaException("Medida inválida.");
		//}
		
		this.tamanho = tamanho;
	}
	
	public String getRecheio() {
		return recheio;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
}