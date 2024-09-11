package aula;

public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private Integer idade;

	public Funcionario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nidade: " + idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Funcionario outro) {

		return idade.compareTo(outro.getIdade());
	}

}
