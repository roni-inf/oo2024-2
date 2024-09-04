package aula;

public class Pessoa {
	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;

	// Encapsulamento
	private double calcularImc() {
		return peso / (altura * altura);
	}

	public String resposta() {
		if (calcularImc() < 18.5) {
			return "Abaixo do Peso";
		} else if (calcularImc() <= 24.9) {
			return "Peso Normal";
		} else {
			return "Acima do Peso";
		}
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
