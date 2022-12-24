package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;

public abstract class Servico {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	private String nome;
	private String descricao;
	private float valor;
	
	public Servico() {
		this(Constante.NOME_PADRAO, Constante.DESCRICAO_PADRAO, Constante.VALOR_PADRAO);
	}
	
	public Servico(String nome, String descricao, float valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return nome + " | Descrição: " + descricao + " | Valor: " + valor;
	}
	
	public void imprimir() {
		System.out.println("Serviço: " + this);
	}
}
