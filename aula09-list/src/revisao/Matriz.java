package revisao;

public class Matriz {
	
	public static void main(String[] args) {
		String[][] pessoas = {{"José","j@gmail.com"},
							  {"Ana" ,"a@gmail.com"},
							  {"Igor","i@gmail.com"}};
		
		for (int i = 0; i < pessoas.length; i++) {
			
			for (int j = 0; j < pessoas[i].length; j++) {
				System.out.println(pessoas[i][j]);
			}
		}
		
	}
}
