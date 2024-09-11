package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploSuperExtends {

	public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(10, 20, 40, 9, 50);
		List<String> listaStrings = Arrays.asList("Samsung", "Apple", "LG");
		List<Object> listaObjetos = new ArrayList<>();
		
		// imprimirListas(listaNumeros);
		// imprimirListas(listaStrings);
		copiarListas(listaNumeros, listaObjetos);
		imprimirListas(listaObjetos);

	}

	public static void imprimirListas(List<?> lista) {
		for (Object o : lista) {
			System.out.println(o);
		}
	}

	public static void copiarListas(List<? extends Number> origem, List<? super Number> destino) {

		for (Number numero : origem) {
			destino.add(numero);
		}
	}

}
