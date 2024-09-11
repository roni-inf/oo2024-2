package aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraDelimitador {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("./teste/alunos.csv"));
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}

			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado!");
		}

	}

}
