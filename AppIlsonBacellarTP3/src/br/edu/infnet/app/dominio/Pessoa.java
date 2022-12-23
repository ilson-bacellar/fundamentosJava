package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;

public class Pessoa {
	
	public String getNome() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome.toUpperCase());
		sb.append(" ");
		sb.append(sobrenome);
		sb.append(" ");
		sb.append(ultimoNome);
		
		return sb.toString();
	}

	public void setNome(String nome) {
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
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
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}
	
	@Override
	public String toString() {
		return "A pessoa é: " + getNome();
	}
	
	public void imprimir() {
		System.out.println(this);
	}

}
