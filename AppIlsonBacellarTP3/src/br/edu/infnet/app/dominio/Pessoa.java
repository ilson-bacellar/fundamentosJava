package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;

public class Pessoa {
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	private String nome;
	private String sobrenome;
	private String ultimoNome;
	
	public Pessoa() {
		this(Constante.NOME);
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "A pessoa é: " + nome + sobrenome + ultimoNome;
	}
	
	public void imprimir() {
		System.out.println(this);
	}

}
