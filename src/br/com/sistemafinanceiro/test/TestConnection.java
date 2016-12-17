package br.com.sistemafinanceiro.test;

import java.sql.Connection;

import br.com.sistemafinanceiro.dao.ConexaoFactory;

public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException {
		ConexaoFactory cf = new ConexaoFactory();

		if (cf != null) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Errado");
		}

	}
}
