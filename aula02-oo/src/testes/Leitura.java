package testes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Leitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o nome:");
		String nome = sc.nextLine();
		System.out.println("Boa noite:" + nome);
		
		System.out.println("Idade:");
		Integer idade = sc.nextInt();

		System.out.println("Salário:");
		Double salario = sc.nextDouble();
	
		System.out.printf("%s tem %d anos e salário de %.2f", nome, idade, salario);
		
		sc.close();
		
		String nome2 = JOptionPane.showInputDialog("Digite o seu nome");
		
		
	}

}
