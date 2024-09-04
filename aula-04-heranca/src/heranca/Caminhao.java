package heranca;

public class Caminhao extends Veiculo {
	private Integer cargaMaxima;

	public Caminhao(String placa, String cor, Double preco, Integer cargaMaxima) {
		super(placa, cor, preco);
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String toString() {
		return super.toString() + "carga Máx.:" + cargaMaxima;
	}

	public Integer getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Integer cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	@Override
	public Double calcularIpva() {
		return preco * 0.05 + 200;
	}
}
