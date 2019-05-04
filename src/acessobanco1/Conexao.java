package acessobanco1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
//	final: o valor não pode ser alterado.
//	static: "variáveis de classe"
	
	public static final String DSN = "jdbc:mysql://localhost/bdJava1";
	public static final String USER = "root";
	public static final String PASS = "123456789";

//	private static final String DSN = "jdbc:mysql://localhost/bdJava1";
//	private String USER = "root";
//	private String PASS = "123456789";

	public Connection getConexao() {
		try {
//			return DriverManager.getConnection(this.DSN, this.USER, this.PASS);
//			return DriverManager.getConnection(Conexao.DSN, Conexao.USER, Conexao.PASS);
			return DriverManager.getConnection(DSN, USER, PASS);
		} catch (Exception e) {
			throw new RuntimeException("Erro: " + e);
		}
	}
}
