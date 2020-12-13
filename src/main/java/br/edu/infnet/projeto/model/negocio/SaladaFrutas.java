package br.edu.infnet.projeto.model.negocio;

//import br.edu.infnet.appLanchonete.model.exception.MedidaInvalidaException;

public class SaladaFrutas extends Produto {
	private boolean mel; // S ou N
	private String retirarFruta; // banana, uva, manga, morango, mamão
	
	public SaladaFrutas(String nome, String descricao, float valorUnitario) {
		super(nome, descricao, valorUnitario);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getMel());
		sb.append(";");
		sb.append(this.getRetirarFruta());
		
		return sb.toString();
	}

	//@Override
	//public float calcularValorVenda() {
	//	return this.getValor() + (this.isProducaoPropria() ? 2 : 0) + this.getMedida() * 0.02f;
	//}

	public boolean getMel() {
		return mel;
	}
	
	//public void setMedida(float medida) throws MedidaInvalidaException {
	public void setMel(boolean mel) {
		
		//if(medida <= 0) {
		//	throw new MedidaInvalidaException("Medida inválida.");
		//}
		
		this.mel = mel;
	}
	
	public String getRetirarFruta() {
		return retirarFruta;
	}
	
	public void setRetirarFruta(String retirarFruta) {
		this.retirarFruta = retirarFruta;
	}
}