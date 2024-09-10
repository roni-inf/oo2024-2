package exception;

public class ContaCorrente implements Conta {
	private String numero;
	private Double saldo;

	public ContaCorrente(String numero, Double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	
	
	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", saldo=" + saldo + "]";
	}



	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public boolean saque(double valor) {
		if (saldo < valor) {
			throw new ContaException("Saldo insuficiente!");
		}
		saldo -= valor;
		return true;
	}

	@Override
	public void deposito(double valor) {
		if (valor <= 0) {
			throw new ContaException("Depósito não efetuado!");
		}
		saldo += valor;

	}

}
