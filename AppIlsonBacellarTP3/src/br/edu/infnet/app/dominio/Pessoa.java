package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.exceptions.NomeIncompletoException;

public class Pessoa {
	
	public String getNome() throws NomeIncompletoException {
		if(nome == null || sobrenome == null || ultimoNome == null) {
			throw new NomeIncompletoException("O preenchimento do campo 'Nome' está incorreto");
		} 
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome.toUpperCase());
		sb.append(" ");
		sb.append(sobrenome);
		sb.append(" ");
		sb.append(ultimoNome);
		
		return sb.toString();
	}

	public void setNome(String nome) throws NomeIncompletoException {
		
		if(nome == null) {
			throw new NomeIncompletoException("O preenchimento do campo 'Nome' está incorreto");
		}
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		if(posInicial < 0 || posFinal < 0) {
			throw new NomeIncompletoException("O preenchimento do campo 'Nome' está incorreto");
		}
		
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
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "A pessoa é: " + nome + " " + sobrenome + " " + ultimoNome;
	}
	
	public void imprimir() throws NomeIncompletoException {
		System.out.println(getNome());
	}

}
