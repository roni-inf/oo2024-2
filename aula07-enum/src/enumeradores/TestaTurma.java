package enumeradores;

public class TestaTurma {

	public static void main(String[] args) {
		Turma turma = new Turma(123, PeriodoCurso.INTEGRAL);
		
		
		System.out.println("Curso:"+ turma.getNumero());
		System.out.println("Dias:"+ turma.getPeriodoCurso().getDias());
		System.out.println("Carga Horária:"+ turma.getPeriodoCurso().getCargaHoraria());
		System.out.println("Valor:"+ turma.getPeriodoCurso().getValor());
	}

}
