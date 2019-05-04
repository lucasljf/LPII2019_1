package acessobanco2;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Fulano");
		a.setIdade(18);
		
		Aluno b = new Aluno();
		b.setNome("Ciclano");
		b.setIdade(20);
		
		AlunoDAO alunoDAO = new AlunoDAO();

		alunoDAO.inserir(a);
		alunoDAO.inserir(b);
		
		ArrayList<Aluno> lista = alunoDAO.listarTodos();
		
		System.out.println(lista);
		
		System.out.println("\nListando dados diretamente da lista");
		System.out.println(lista.get(0).getNome());
		System.out.println(lista.get(0).getIdade());
		
		System.out.println("\nListando dados a partir de um objeto aluno");
		Aluno x = lista.get(1);
		System.out.println(x.getIdAluno());
		System.out.println(x.getNome());
		System.out.println(x.getIdade());
		
		System.out.println("\nFim da execução");
	}
}
