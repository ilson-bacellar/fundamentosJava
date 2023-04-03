package br.edu.infnet.appdent.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appdent.model.auxiliar.Constante;

@Entity
@Table(name = "TLimpeza")
public class Limpeza extends Servico {

		
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}

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

//	private Integer id;
	private boolean dessensibilizacao;
	private boolean clareamento;
	private boolean periodontia;
	
	
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
