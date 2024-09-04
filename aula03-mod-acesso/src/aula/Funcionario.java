package aula;

import javax.swing.JOptionPane;

public class Funcionario {

	private String cpf;
	private String nome;
	private Double salarioBruto;
	private static int total = 0;
	
	public Funcionario() {
		System.out.println("Entrou no construtor");
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public static int getTotal() {
		return total;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalarioBruto(Double salarioBruto) {
		if (salarioBruto > 1402.) {

			this.salarioBruto = salarioBruto;
		} else {
			JOptionPane.showMessageDialog(null, "Salário inválido");
		}
	}

	public Double calcularFolha() {
		registro();
		return salarioBruto * 0.83;
	}

	public static int registro() {
		return total++;
	}

}
