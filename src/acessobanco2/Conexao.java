package acessobanco2;

import java.sql.Connection;
import java.sql.DriverManager;

public final class Conexao {
	
	public static final String DSN = "jdbc:mysql://localhost/bdJava1";
	public static final String USER = "root";
	public static final String PASS = "123456789";
	
	public Connection getConexao() {
		try {
			return DriverManager.getConnection(DSN, USER, PASS);
		} catch (Exception e) {
			throw new RuntimeException("Erro: " + e);
		}
	}
}
