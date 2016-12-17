package br.com.sistemafinanceiro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.LNEG;

import br.com.sistemafinanceiro.bean.ConsultaLancamentoBean;
import br.com.sistemafinanceiro.model.LancamentoModel;

public class LancamentoDAO {
	private Connection con = ConexaoFactory.getConection();

	public void cadastrar(LancamentoModel lancamento) {
		String sql = "INSERT INTO lancamento(tipo, pessoa, descricao, valor, data_vencimento,"
				+ " data_pagamento) VALUES(?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement pst = con.prepareStatement(sql);
			/*
			pst.setString(1, lancamento.getTipo());
			pst.setString(2, lancamento.getPessoa());
			pst.setString(3, lancamento.getDescricao());
			pst.setFloat(4, lancamento.getValor());
			pst.setString(5, lancamento.getDataVencimento());
			pst.setString(6, lancamento.getDataPagamento());

			pst.executeUpdate();
			System.out.println("Cadastrado realizado com sucesso!!");
			*/

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<ConsultaLancamentoBean>listar(){
		String sql = "SELECT * FROM lancamento";
		ArrayList<ConsultaLancamentoBean> lista = new ArrayList<ConsultaLancamentoBean>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()){
				LancamentoModel lancamento = new LancamentoModel();
//				lancamento.set 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
