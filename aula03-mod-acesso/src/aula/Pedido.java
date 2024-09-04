package aula;

import java.time.LocalDate;

public class Pedido {
	private Integer numero;
	private LocalDate data;
	private Double total;
	private static int cont;
	
	public Pedido(Integer numero, LocalDate data, Double total) {
		this.numero = numero;
		this.data = data;
		this.total = total;
		cont ++;
	}


	public static int getCont() {
		return cont;
	}



	public void setCont(int cont) {
		this.cont = cont;
	}



	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
