package aula;

import java.util.List;

public class TesteGenerics {

	public static void main(String[] args) {
		ExemploGenerics<String> var1 = new ExemploGenerics<String>("oi");
		ExemploGenerics<Double> var2 = new ExemploGenerics<Double>(1000.);

		System.out.println(var1);
		System.out.println(var2);
	}

}
