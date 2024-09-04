package heranca;

public abstract class Veiculo {
	protected String placa;
	protected String cor;
	protected Double preco;

	public Veiculo(String placa, String cor, Double preco) {
		this.placa = placa;
		this.cor = cor;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "placa:" + placa + " cor:" + cor + " preço:" + preco;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public abstract Double calcularIpva();
	
}
