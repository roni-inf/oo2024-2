package revisao;

public abstract class Funcionario {
	protected String nome;
	protected Double salario;
	protected String turno;

	public Funcionario(String nome, Double salario, String turno) {
		this.nome = nome;
		this.salario = salario;
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "nome:" + nome + " salário:" + salario + " turno:" + turno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public abstract void reajusteSalarial(); 
}
