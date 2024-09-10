package aula;

public enum TipoServico {
	OLEO(100),LAVAGEM(50);
	private double valorPorServico;

	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}
	
	
}
