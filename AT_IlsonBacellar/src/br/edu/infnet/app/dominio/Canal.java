package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;

public class Canal extends Servico{
	
	
	public int getNumeroSessoes() {
		return numeroSessoes;
	}

	public void setNumeroSessoes(int numeroSessoes) {
		this.numeroSessoes = numeroSessoes;
	}
	
	public String getTipoRestauracao() {
		return tipoRestauracao;
	}

	public void setTipoRestauracao(String tipoRestauracao) {
		this.tipoRestauracao = tipoRestauracao;
	}

	public String getTipoCoroa() {
		return tipoCoroa;
	}

	public void setTipoCoroa(String tipoCoroa) {
		this.tipoCoroa = tipoCoroa;
	}

	private int numeroSessoes;
	private String tipoRestauracao;
	private String tipoCoroa;
	
	public Canal() {
		this(Constante.NOME_PADRAO, Constante.DESCRICAO_PADRAO, Constante.VALOR_PADRAO);
	}
	
	public Canal(String nome, String descricao, float valor) {
		super(nome, descricao, valor);
	}
	
	public Canal(String nome, String descricao, float valor, int numeroSessoes, String tipoRestauracao, String tipoCoroa) {
		this(nome, descricao, valor);
		this.numeroSessoes = numeroSessoes;
		this.tipoRestauracao = tipoRestauracao;
		this.tipoCoroa = tipoCoroa;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | N�mero de sess�es: " + numeroSessoes + " | Tipo de restaura��o: " + tipoRestauracao + " | Tipo de coroa: " + tipoCoroa;
	}
	
}
