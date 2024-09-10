package revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		Assistente a = new Assistente("Roberto", 2200., "Noite", "Nível-1");
		Diretor d = new Diretor("Ana",8500., "Integral", "Financeiro");
		
		a.reajusteSalarial();
		d.reajusteSalarial();
		
		System.out.println(a);
		System.out.println(d);
		
	}

}
