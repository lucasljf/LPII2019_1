package acessobanco1;

public class Teste {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Teste1");
		a.setIdade(25);
		
		a.inserir();
		
		System.out.println("Fim da execução");
	}
}
