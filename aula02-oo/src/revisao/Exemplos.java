package revisao;

public class Exemplos {

	public static void main(String[] args) {
		// int i = 1;
		/*
		 * while (i <= 10) { System.out.println(i); i++; }
		 */
		/*
		 * do { System.out.println(i); i++; } while (i <= 10);
		 * 
		 * for (int j = 1; j <= 10; j++) { System.out.println(j); }
		 */

		String[] times = { "Vasco", "Flamengo", "Botafogo", "Fluminense" };

		for (int j = 0; j < times.length; j++) {
			if (j >= 1 && j <= 2) {
				continue;
			}
			System.out.println(times[j]);
		}

		/*
		 * System.out.println("****Foreach***********"); for (String t : times) {
		 * System.out.println(t); }
		 */

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " é Par");
			} else {
				System.out.println(i + " é Impar");
			}
		}
	}

}
