package heranca;

public class Gerente extends Empregado {
	private String categoria;
	private Integer numeroEmpregados;
	
	
		
	public Gerente(String nome, String cpf, Double salario, String categoria, Integer numeroEmpregados) {
		super(nome, cpf, salario);
		this.categoria = categoria;
		this.numeroEmpregados = numeroEmpregados;
	}

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " categoria:" + categoria + "Nº Emp." + numeroEmpregados;
	}

	@Override
	public void aumentarSalario() {
		salario = salario * 1.15;

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getNumeroEmpregados() {
		return numeroEmpregados;
	}

	public void setNumeroEmpregados(Integer numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}

}
