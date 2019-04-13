package exemploherancapolimorfismo;

public class Diretor extends Empregado {
	String getInfo() {
		return super.getInfo() + " e ele é um reitor";
	}
}
