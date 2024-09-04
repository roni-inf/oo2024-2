package aula;

import javax.swing.JOptionPane;

public class GerarFolhaJOption {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		funcionario.setCpf(JOptionPane.showInputDialog("Digite o cpf do funcionario:"));
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario:"));
		funcionario.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario:")));

			JOptionPane.showMessageDialog(null,"Nome:"+funcionario.getNome()+ " Sal. Liq.: " + funcionario.calcularFolha());
			JOptionPane.showMessageDialog(null, "Folha gerada com sucesso");
			
			
		System.out.println("Total de funcionários" + Funcionario.getTotal());
	}
}
