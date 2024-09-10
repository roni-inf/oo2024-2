package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraArquivo {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("./src/teste.txt");
			System.out.println("Arquivo encontrado!");
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado!");
			e.printStackTrace();
		}
	}

}
