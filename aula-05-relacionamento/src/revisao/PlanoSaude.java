package revisao;

public abstract class PlanoSaude {
	protected String nome;
	protected Double valorPago = 100.;
	protected Double valorISS = 5.;

	public PlanoSaude(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
			return "nome:" + nome + " valor pago:"+ String.format("%.2f", valorPago);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public Double getValorISS() {
		return valorISS;
	}

	public void setValorISS(Double valorISS) {
		this.valorISS = valorISS;
	}
	
	
	public Double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorISS/100; 
	}

	
}
