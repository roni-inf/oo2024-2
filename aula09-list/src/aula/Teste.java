package aula;

public class Teste {
	public static void main(String[] args) {
		try {
			Integer resultado = calcularSoma(null, 20);
			System.out.println("Resultado: " + resultado);
		} catch (IllegalArgumentException | NullPointerException e) {
			System.out.println("Erro: Um dos argumentos é inválido ou nulo.");
		}
	}

	public static Integer calcularSoma(Integer a, Integer b) {
		if (a == null || b == null) {
			throw new IllegalArgumentException("Argumento nulo!");
		}
		return a + b;
	}
}
