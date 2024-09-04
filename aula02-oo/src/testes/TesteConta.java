package testes;

import banco.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 134;
		conta1.titular = "Roni";
		conta1.saldo = 1000.0;

		conta1.deposito(500.);
		Conta.imprimir();
		
		Conta conta2 = new Conta();
		conta2.numero = 321;
		conta2.titular = "Ana";
		conta2.saldo = 2000.;
		conta2.deposito(100.);
		Conta.imprimir();
		
		if (conta1.saque(200.)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}

		System.out.println(conta1.saldo);
	}

}
