package br.edu.infnet.app.dominio;

import java.util.Arrays;

import br.edu.infnet.app.auxiliar.Constante;

public class Paciente {
	
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
		
	public Servico[] getServicos() {
		return servicos;
	}
	public void setServicos(Servico[] servicos) {
		this.servicos = servicos;
	}
	
	private String nome;
	private String sobrenome;
	private String ultimoNome;
	private String telefone;
	private String prontuario;
	private Servico[] servicos;

	public Paciente() {
		this.nome = Constante.NOME_PADRAO;
		this.telefone = Constante.DATA_PADRAO;
		this.prontuario = Constante.PRONTUARIO_PADRAO;
	}
	
	public Paciente(String nome, String telefone) {
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
		this.telefone = telefone;
		this.prontuario = Constante.PRONTUARIO_PADRAO;
	}
	
	public Paciente(String nome, String telefone, String prontuario) {
		this(nome, telefone);
		this.prontuario = prontuario;
	}
	
	public String toString() {
		return "Nome: " + getNome() + " | Telefone: " + telefone + " | Prontuário: " + prontuario;
	}
	
	private void imprimirServicos() {
		if(servicos != null) {
			for (Servico servico : servicos) {
				System.out.printf("\t%s; Descrição: %s; Valor: %.2f\n",
					servico.getNome(), 
					servico.getDescricao(),
					servico.getValor() 
					);
			}  
		}
	}
	
	private int calcularQtdeServicos() {
		return servicos != null ? servicos.length : 0;
	}
	
	
	public void imprimir() {
		System.out.println(this);
		
		System.out.println("Serviços contratados: " + calcularQtdeServicos());
		
		imprimirServicos();
		
		System.out.println("");
	}
		
		
}
