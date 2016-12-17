package br.com.sistemafinanceiro.model;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private Integer cod;
	private String nome;

	public Pessoa() {

	}

	public Pessoa(Integer cod, String nome) {
		this.setCod(cod);
		this.setNome(nome);
	}

	public Pessoa(String nome) {
		this.setNome(nome);
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
