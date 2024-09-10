package exception;

public class Exemplo {

	// throw - lançar
	// throws - encaminhar o tratamento erro para o método chamador
	public static double calcular(int a, int b) throws ArithmeticException {
		/*if (b == 0) {
			throw new ArithmeticException("Erro de divisão por zero!");
		}
		*/
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Entrando no Try");
			System.out.println("Resultado:" + calcular(10, 0));
			System.out.println("Finalizando Try");
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Erro de divisão por zero!");
		}finally {
			System.out.println("Sempre é executado!");
		}

	}

}
