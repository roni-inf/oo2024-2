package aula;

import aula.Funcionario.EstadoCivil;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Carla", EstadoCivil.VIUVO);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getEstadoCivil());
		System.out.println(funcionario.getEstadoCivil().ordinal());
	}

}
