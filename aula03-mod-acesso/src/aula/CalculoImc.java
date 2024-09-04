package aula;

public class CalculoImc {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();

		p.setCodigo(123);
		p.setNome("Flávia");
		p.setAltura(1.78);
		p.setPeso(68.);

		System.out.println("Resultado:" + p.resposta());

	}
}
