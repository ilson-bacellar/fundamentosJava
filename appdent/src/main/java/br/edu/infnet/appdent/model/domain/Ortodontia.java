package br.edu.infnet.appdent.model.domain;

import br.edu.infnet.appdent.model.auxiliar.Constante;

public class Ortodontia extends Servico {

	public float getManutencao() {
		return manutencao;
	}

	public void setManutencao(float manutencao) {
		this.manutencao = manutencao;
	}

	public int getDuracaoEmMeses() {
		return duracaoEmMeses;
	}

	public void setDuracaoEmMeses(int duracaoEmMeses) {
		this.duracaoEmMeses = duracaoEmMeses;
	}
	
	public boolean isMicroimplante() {
		return microimplante;
	}

	public void setMicroimplante(boolean microimplante) {
		this.microimplante = microimplante;
	}

	private float manutencao;
	private int duracaoEmMeses;
	private boolean microimplante;
	
	public Ortodontia() {
		this(Constante.NOME_PADRAO, Constante.DESCRICAO_PADRAO, Constante.VALOR_PADRAO);
	}
	
	public Ortodontia(String nome, String descricao, float valor) {
		super(nome, descricao, valor);
	}
	
	public Ortodontia(String nome, String descricao, float valor, float manutencao, int duracaoEmMeses, boolean microimplante) {
		this(nome, descricao, valor);
		this.manutencao = manutencao;
		this.duracaoEmMeses = duracaoEmMeses;
		this.microimplante = microimplante;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Manutenção: " + manutencao + " | Duração do tratamento (em meses): " + duracaoEmMeses + " | Microimplante? " + microimplante;
	}
	
}
