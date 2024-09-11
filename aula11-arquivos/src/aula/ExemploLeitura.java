package aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String[] args) {
		File arquivo = new File("/curso/aula.txt");
		try {
			Scanner sc = new Scanner(arquivo, StandardCharsets.UTF_8);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.err.println("Codificação inválida");
		}
	}

}
