package aula;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("Matheus");
		nomes.add("Gabriela");

		if (nomes.contains("Matheus")) {
			//System.out.println(nomes.indexOf("Matheus"));
			nomes.remove(nomes.indexOf("Matheus"));
		}
		
		for (String nome: nomes) {
				System.out.println(nome);
			}
		}
	}

