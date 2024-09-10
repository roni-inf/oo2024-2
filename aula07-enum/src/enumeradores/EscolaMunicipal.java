package enumeradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EscolaMunicipal extends Escola {
	private final String SEGMENTO;

	public EscolaMunicipal(String cnpj, String razaoSocial, String SEGMENTO) {
		super(cnpj, razaoSocial);
		this.SEGMENTO = SEGMENTO;
	}

	public String getSEGMENTO() {
		return SEGMENTO;
	}


	public static void main(String[] args) {
		List<String> cores = new ArrayList<>();
		cores.add("Branco");
		
		List<String> times = Arrays.asList("Fla","Vasco");
		times.set(0, "Flamengo");
		System.out.println(times);
		times.add("Botafogo");
		
		EscolaMunicipal em = new EscolaMunicipal("123", "Liceu", "Fundamental");
	}
	
	
}
