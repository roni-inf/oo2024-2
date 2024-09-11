package aula;

public class Calculo<T> {
	private T numero;

	public Calculo(T numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Calculo [numero=" + numero + "]";
	}

	public T getNumero() {
		return numero;
	}

	public void setNumero(T numero) {
		this.numero = numero;
	}

	
	public static void main(String[] args) {
		Calculo<Integer> c1 = new Calculo<Integer>(10);
		Calculo<Double>  c2 = new Calculo<Double>(100.);
	}
}
