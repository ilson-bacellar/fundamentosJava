package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.exceptions.NomeIncompletoException;

public class Aluno extends Pessoa{
	
	public float getAv1() {
		return av1;
	}

	public void setAv1(float av1) {
		this.av1 = av1;
	}

	public float getAv2() {
		return av2;
	}

	public void setAv2(float av2) {
		this.av2 = av2;
	}
	
	private float av1;
	private float av2;
	private float media = calcularMedia(av1, av2);
	private String situacao = situacaoAluno(media);
	
	public Aluno() throws NomeIncompletoException {
		this.setNome(Constante.NOME_ALUNO_PADRAO);
	}
	
	public Aluno(String nome) {
		super(nome);
	}
	
	public Aluno(String nome, float av1, float av2) {
		super(nome);
		this.av1 = av1;
		this.av2 = av2;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | AV1: " + av1 + " | AV2: " + av2 + " | Média: " + media + " | Situação: " + situacao;
	}
	
	private float calcularMedia(float ava1, float ava2) {
		return (ava1 + ava2) / 2;
	}
	
	private String situacaoAluno(float aMedia) {
		return (aMedia < 7) ? "reprovado" : "aprovado";
	}
	
	public void imprimir() throws NomeIncompletoException {
		System.out.println("Nome: " + getNome() + " | AV1: " + av1 + " | AV2: " + av2 + " | Média: " + media + " | Situação: " + situacao);
	}

}
