package exemploherancapolimorfismo;

public class Professor extends Empregado {
	private int horasAulas;
	
	double getGastos() {
		return this.getSalario() + this.horasAulas * 10;
	}
	
	String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas de aula: " + this.horasAulas;
		return informacao;
	}

	public void setHorasAulas(int horasAulas) {
		this.horasAulas = horasAulas;
	}
}
