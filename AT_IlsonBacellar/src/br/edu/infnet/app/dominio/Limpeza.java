package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;

public class Limpeza extends Servico{

	public boolean isDessensibilizacao() {
		return dessensibilizacao;
	}

	public void setDessensibilizacao(boolean dessensibilizacao) {
		this.dessensibilizacao = dessensibilizacao;
	}

	public boolean isClareamento() {
		return clareamento;
	}

	public void setClareamento(boolean clareamento) {
		this.clareamento = clareamento;
	}

	public boolean getPeriodontia() {
		return periodontia;
	}

	public void setPeriodontia(boolean periodontia) {
		this.periodontia = periodontia;
	}

	public boolean dessensibilizacao;
	public boolean clareamento;
	public boolean periodontia;
	
	public Limpeza() {
		this(Constante.NOME_PADRAO, Constante.DESCRICAO_PADRAO, Constante.VALOR_PADRAO);
	}
	
	public Limpeza(String nome, String descricao, float valor) {
		super(nome, descricao, valor);
	}
	
	public Limpeza(String nome, String descricao, float valor, boolean dessensibilizacao, boolean clareamento, boolean periodontia) {
		this(nome, descricao, valor);
		this.dessensibilizacao = dessensibilizacao;
		this.clareamento = clareamento;
		this.periodontia = periodontia;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Dessensibilização: " + dessensibilizacao + " | Clareamento: " + clareamento + " | Periodontia: " + periodontia;
	}
}
