package revisao;

public class AssistenteFinanceiro extends Assistente {
		private String curso;

		public AssistenteFinanceiro(String nome, Double salario, String turno, String nivel, String curso) {
			super(nome, salario, turno, nivel);
			this.curso = curso;
		}

		
		
		@Override
		public String toString() {
			return "curso:" + curso + " dados:" + super.toString();
		}



		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		
		
}
