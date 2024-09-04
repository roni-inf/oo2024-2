package revisao;

public class Clinica extends PlanoSaude {
	private String nomeClinica;
	private String cnpj;

	public Clinica(String nome, String nomeClinica, String cnpj) {
		super(nome);
		this.nomeClinica = nomeClinica;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Clinica:" + nomeClinica + ", cnpj:" 
	+ cnpj + ", Plano:" + super.toString();
	}

	public String getNomeClinica() {
		return nomeClinica;
	}

	public void setNomeClinica(String nomeClinica) {
		this.nomeClinica = nomeClinica;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	
}
