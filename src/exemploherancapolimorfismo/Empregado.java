package exemploherancapolimorfismo;

public class Empregado {
	private String nome;
	private double salario;
	
	double getGastos() {
		return this.salario;
	}
	
	String getInfo() {
		return "nome: " + this.nome + " com salário " + this.salario;
	}
	
	double getSalario() {
		return this.salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
