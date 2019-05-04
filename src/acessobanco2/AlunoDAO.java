package acessobanco2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class AlunoDAO {
	private Connection conexao;
	private PreparedStatement stmt;
	
	public AlunoDAO() {
		this.conexao = new Conexao().getConexao();
	}
	
	public void inserir(Aluno aluno) {
		String sql = "INSERT INTO aluno (nome, idade) VALUES (?, ?)";
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setInt(2, aluno.getIdade());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException("Erro: " + e);
		}
	}
	
	public ArrayList<Aluno> listarTodos() {
		String sql = "SELECT * FROM aluno";
		try {
			stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Aluno> lista = new ArrayList<Aluno>();
			while (rs.next()) {
				Aluno a = new Aluno();
				//dados poderiam ser passados via construtor
				a.setIdAluno(rs.getInt("idAluno"));
				a.setNome(rs.getString("nome"));
				a.setIdade(rs.getInt("idade"));
				lista.add(a);
			}
			stmt.close();
			return lista;
		} catch (Exception e) {
			throw new RuntimeException("Erro: " + e);
		}
	}
}
