package br.com.sistemafinanceiro.bean;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.sistemafinanceiro.model.LancamentoModel;
import br.com.sistemafinanceiro.model.TipoLancamento;

@ManagedBean
@ViewScoped
public class CadastroLancamentoBean implements Serializable {
	private LancamentoModel lancamento = new LancamentoModel();

	public void cadastrar() {
		System.out.println("Tipo: " + this.lancamento.getTipo());
		// System.out.println("Pessoa: " +
		// this.lancamento.getPessoa().getNome());
		System.out.println("Descrição: " + this.lancamento.getDescricao());
		System.out.println("Valor: " + this.lancamento.getValor());
		System.out.println("Data vencimento: " + this.lancamento.getDataVencimento());
		System.out.println("Conta paga: " + this.lancamento.isPago());
		System.out.println("Data pagamento: " + this.lancamento.getDataPagamento());

		this.lancamento = new LancamentoModel();

		String msg = "Cadastro efetuado com sucesso!";
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
	}

	public LancamentoModel getLancamento() {
		return lancamento;
	}

	public TipoLancamento[] getTiposLancamentos() {
		return TipoLancamento.values();
	}

}
