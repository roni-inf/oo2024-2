package heranca;

public class Moto extends Veiculo {
	private Boolean capacete;

	public Moto(String placa, String cor, Double preco, Boolean capacete) {
		super(placa, cor, preco);
		this.capacete = capacete;
	}

	@Override
	public String toString() {
		return super.toString() + "capacete:" + capacete;
	}

	public Boolean getCapacete() {
		return capacete;
	}

	public void setCapacete(Boolean capacete) {
		this.capacete = capacete;
	}

	@Override
	public Double calcularIpva() {
		return preco * 0.04 + 100;
	}

}
