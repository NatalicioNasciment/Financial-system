package br.com.sistemafinanceiro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConection() {
		// http://locahost:5433/aplicacao
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
//			return DriverManager.getConnection("jdbc:postgresql://localhost:5433/fabricaweb", "postgres", "root");
			return DriverManager.getConnection("jdbc:postgresql://localhost:5433/sistemafinanceiro", "postgres", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
