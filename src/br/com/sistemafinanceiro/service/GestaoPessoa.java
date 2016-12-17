package br.com.sistemafinanceiro.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.sistemafinanceiro.model.Pessoa;

public class GestaoPessoa {
	private static HashMap<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();

	static {
		pessoas.put(1, new Pessoa("Natalicio"));
		pessoas.put(2, new Pessoa("Gerlane"));
		pessoas.put(3, new Pessoa("Nataliano"));
	}

	public List<Pessoa> listaTodos() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.addAll(GestaoPessoa.pessoas.values());
		return pessoas;
	}

	public Pessoa buscarPorCodigo(int cod) {
		return pessoas.get(cod);
	}
}
