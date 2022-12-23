package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.exceptions.NomeIncompletoException;
import br.edu.infnet.app.exceptions.TelefoneInvalidoException;

public class Paciente {
	
	public String getNome() throws NomeIncompletoException {
		
		if(nome == null || sobrenome == null || ultimoNome == null) {
			throw new NomeIncompletoException("O preenchimento do campo 'Nome' � obrigat�rio");
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
			throw new NomeIncompletoException("O preenchimento do campo 'Nome' � obrigat�rio");
		}
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		if(posInicial < 0 || posFinal < 0) {
			throw new NomeIncompletoException("O preenchimento do campo 'Nome' est� incorreto");
		}
		
		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}
	
	public String getTelefone() throws TelefoneInvalidoException {
		
		if(telefone == null) {
			throw new TelefoneInvalidoException("O preenchimento do campo 'Telefone' � obrigat�rio");
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(telefone);
		sb.append("-");
		sb.append(telefoneFinal);
		return sb.toString();
	}
	
	public void setTelefone(String telefone) throws TelefoneInvalidoException {
		
		if(telefone == null) {
			throw new TelefoneInvalidoException("O preenchimento do campo 'Telefone' � obrigat�rio");
		}
				
		if(telefone.length() != 8) {
			throw new TelefoneInvalidoException("O preenchimento do campo 'Telefone' est� incorreto");
		}
		
		this.telefone = telefone.substring(0, 4);
		this.telefoneFinal = telefone.substring(4);
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
	private String telefoneFinal;
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
		return "Nome: " + nome + " " + sobrenome + " " + ultimoNome +  " | Telefone: " + telefone  + " | Prontu�rio: " + prontuario;
	}
	
	private void imprimirServicos() {
		if(servicos != null) {
			for (Servico servico : servicos) {
				System.out.printf("\t%s; Descri��o: %s; Valor: %.2f\n",
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
	
	
	public void imprimir() throws NomeIncompletoException, TelefoneInvalidoException {
		System.out.println("Nome: " + getNome() + " | Telefone: " + getTelefone() + " | Prontu�rio: " + prontuario);
		
		System.out.println("Servi�os contratados: " + calcularQtdeServicos());
		
		imprimirServicos();
		
		System.out.println("");
	}
		
		
}
