package exemploherancapolimorfismo;

public class Teste {
	public static void main(String[] args) {
		Relatorio relatorio = new Relatorio();
		
		Empregado empregado = new Empregado();
		empregado.setNome("Fulano");
		empregado.setSalario(1000);
//		System.out.println(empregado.getInfo());
		relatorio.adiciona(empregado);
		
		Professor professor = new Professor();
		professor.setNome("Teste");
		professor.setSalario(1500);
		professor.setHorasAulas(20);
//		System.out.println(professor.getInfo());
		relatorio.adiciona(professor);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Ciclano");
		diretor.setSalario(2000);
//		System.out.println(diretor.getInfo());
		relatorio.adiciona(diretor);
	}
}
