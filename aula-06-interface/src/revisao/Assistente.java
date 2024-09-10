package revisao;

public class Assistente extends Funcionario {
	private String nivel;

	public Assistente(String nome, Double salario, String turno, String nivel) {
		super(nome, salario, turno);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return  " dados:" + super.toString() + " nível:" + nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public void reajusteSalarial() {
		salario *= 1.18;
	}

}
