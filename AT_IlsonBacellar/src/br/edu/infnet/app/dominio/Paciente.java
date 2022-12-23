package br.edu.infnet.app.dominio;

import java.util.Arrays;

import br.edu.infnet.app.auxiliar.Constante;

public class Paciente {
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	private String telefone;
	private String prontuario;
	private Servico[] servicos;

	public Paciente() {
		this.nome = Constante.NOME_PADRAO;
		this.telefone = Constante.DATA_PADRAO;
		this.prontuario = Constante.PRONTUARIO_PADRAO;
	}
	
	public Paciente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.prontuario = Constante.PRONTUARIO_PADRAO;
	}
	
	public Paciente(String nome, String telefone, String prontuario) {
		this(nome, telefone);
		this.prontuario = prontuario;
	}
	
	public String toString() {
		return "Nome: " + nome + " | Telefone: " + telefone + " | Prontuário: " + prontuario;
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
