package exemplos;

import javax.swing.JOptionPane;

public class Exercicios {
	public static void main(String[] args) {
		double altura, idade;

		boolean a = !(1 == 1);

		// altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:
		// "));
		// idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:
		// "));
		/*
		 * if (altura >= 1.60 || idade >= 18) { System.out.println("Pode participar"); }
		 * else { System.out.println("Não pode participar"); }
		 */

		// String res= (altura >= 1.60 || idade >= 18 ? "Pode participar": "Não pode
		// participar" );
//		System.out.println("O atleta:" + res);

		int mes = 4;
		System.out.println((mes == 1 ? "Janeiro" : mes == 2 ? "Fevereiro" : mes == 3 ? "Março" : "Abril"));

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;

		case 2:
			System.out.println("Fevereiro");
			break;

		case 3:
			System.out.println("Março");
			break;

		case 4:
			System.out.println("Abril");
			break;

		default:
			System.out.println("Mês inválido");
			break;
		}

		String dia = "Domingo";

		String resultado = switch (dia) {
		case "Domingo" -> "Fim de semana";
		case "Segunda" -> "Dia util";
		case "Terça" -> "Dia util";
		default -> "Dia inválido";
		};
		System.out.println("Resultado:" + resultado);

		String time = "Flamengo";
		String resposta = switch (time) {
		case "Flamengo", "Vasco", "Botafogo", "Fluminense" -> "Rio de Janeiro";
		case "Cruzeiro", "Atlético-MG" -> "Minas Gerais";
		default -> "Time inválido";
		};
		System.out.println(resposta);
	}
}