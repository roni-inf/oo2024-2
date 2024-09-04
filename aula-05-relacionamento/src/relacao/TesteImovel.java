package relacao;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Roni", "roni@gmail.com");
		Pessoa p2 = new Pessoa("Adriana", "a@gmail.com");
		
		Imovel i1 = new Imovel("Casa", 188000., p2);
		
		System.out.println(i1);
		
		
	}

}
