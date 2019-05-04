package acessobanco1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Aluno {
	
	private int idAluno;
	private String nome;
	private int idade;
	
	public int getIdAluno() {
		return idAluno;
	}
	
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void inserir() {
		Connection conexao = new Conexao().getConexao();
		String sql = "INSERT INTO aluno (nome, idade) VALUES (?, ?)";
		try {
			PreparedStatement stmt;
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, this.getNome());
			stmt.setInt(2, this.getIdade());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException("Erro: " + e);
		}
	}
}
