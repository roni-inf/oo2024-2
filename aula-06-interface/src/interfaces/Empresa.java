package interfaces;

public class Empresa implements Tributos {
	private String razaoSocial;
	private Double rendimentos;

	public Empresa(String razaoSocial, Double rendimentos) {
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(Double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public double calcularIR() {
		return rendimentos * IRPESSOAJURIDICA;
	}

	@Override
	public Double calcularICMS() {
		return rendimentos * ICMS;
	}

}
