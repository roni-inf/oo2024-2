package aula;

public class GerarFolha {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("23243");
		funcionario.setNome("Ana Maria");
		funcionario.setSalarioBruto(3000.);

		if (funcionario.getSalarioBruto()> 1402.) {
			System.out.println("Sal. Liq.:" + funcionario.calcularFolha());
			System.out.println("Folha gerada....");
		} else {
			System.out.println("Salário inválido");
		}
	}

}
