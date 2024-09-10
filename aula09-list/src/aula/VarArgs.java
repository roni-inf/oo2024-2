package aula;

import java.util.Arrays;
import java.util.List;

public class VarArgs {

	public static void main(String[] args) {
		int total = 0;
		total = calcularSoma(100, 20, 30, 10);
		System.out.println("Total:" + total);
	}

	// quem chamar esse método poderá passar quantos valores quiser
	public static int calcularSoma(int num, int... numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}

		System.out.println("Soma:" + soma);

		return soma * num;
		// return soma;
	}
}
