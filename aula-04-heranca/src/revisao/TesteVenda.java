package revisao;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		Venda v1 = new Venda(1, LocalDate.of(2024, 9, 01), 2,50., 0.);
		Venda v2 = new Venda(2, LocalDate.now(),5, 21.8, 0.);
		
		v1.finalizarVenda();
		v2.finalizarVenda();
		
		System.out.println(v1);
		System.out.println(v2);
		
	}

}
