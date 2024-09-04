package relacao;

public class Imovel {
	private String tipo;
	private Double valor;
	private Pessoa pessoa;

	public Imovel(String tipo, Double valor, Pessoa pessoa) {
		this.tipo = tipo;
		this.valor = valor;
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "tipo:" + tipo + " valor:" + valor +" " + pessoa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
