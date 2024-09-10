package enumeradores;

public class Pessoa {
	private String nome;
	private EstadoCivil estadoCivil;

	public Pessoa(String nome, EstadoCivil estadoCivil) {
		super();
		this.nome = nome;
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
