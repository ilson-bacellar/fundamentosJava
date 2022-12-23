package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante;

public class Professor extends Pessoa{
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	private int idade;
	private float salario;
	private float bonus;
	private float desconto;

	public Professor() {
		this.setNome(Constante.NOME_PROFESSOR_PADRAO);
	}
	
	public Professor(String nome) {
		super(nome);
	}
	
	public Professor(String nome, int idade, float salario, float bonus, float desconto) {
		super(nome);
		this.idade = idade;
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto; 
	}

	@Override
	public String toString() {
		return super.toString() + " | Idade: " + idade + " | Salário base: " + salario + " | Bônus: " + bonus + " | Desconto: " + desconto + " | Salário líquido: " + calcularSalario(salario, bonus, desconto);
	}
	
	private float calcularSalario(float salario, float bonus, float desconto) {
		return (salario - desconto) + bonus;
	}
	
}
