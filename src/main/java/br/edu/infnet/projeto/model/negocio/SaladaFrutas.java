package br.edu.infnet.projeto.model.negocio;

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
		sb.append(this.isMel());
		sb.append(";");
		sb.append(this.getRetirarFruta());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() { // + R$ 2 
		return this.getValorUnitario() + (this.isMel() ? +2.0f : 0);
	}

	public boolean isMel() {
		return mel;
	}
	
	public void setMel(boolean mel) {
		this.mel = mel;
	}
	
	public String getRetirarFruta() {
		return retirarFruta;
	}
	
	public void setRetirarFruta(String retirarFruta) {
		this.retirarFruta = retirarFruta;
	}
}