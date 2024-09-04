package aula;

import java.util.Scanner;

public class GerarFolhaScanner {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario= new Funcionario();
		
		System.out.println("Digite seu cpf");
		funcionario.setCpf(leia.next());
		System.out.println("Digite seu nome");
		funcionario.setNome(leia.next()) ;
		System.out.println("Digite seu salario");
		funcionario.setSalarioBruto(leia.nextDouble());
	
		if (funcionario.getSalarioBruto() > 1402.) {
			System.out.println("Salario liquido: " +funcionario.calcularFolha()); 
			System.out.println("Folha Gerada");
		}
		else {
			System.out.println("Salário invalido");
		}
		leia.close();
	}

}
