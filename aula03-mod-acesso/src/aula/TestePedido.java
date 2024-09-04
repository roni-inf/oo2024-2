package aula;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(124, LocalDate.now(), 100.);
		Pedido pedido2 = new Pedido(311, LocalDate.of(2024, 8, 29), 200.0);
		Pedido pedido3 = new Pedido(2343, LocalDate.now(), 350.);

		System.out.println(pedido.getNumero());
		System.out.println(pedido.getTotal());
		
		System.out.println("Total Geral de Pedidos:"+ Pedido.getCont());
	}

}
