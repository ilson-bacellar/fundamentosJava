package br.edu.infnet.app.testes;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.dominio.Professor;

public class ProfessorTeste {

public static void main(String[] args) {
		
		Professor p1 = new Professor();
		p1.setNome("Elberth");
		p1.setIdade(40);
		p1.setSalario(5000);
		p1.setBonus(1000);
		p1.setDesconto(300);
		p1.imprimir();
		
		Professor p2 = new Professor("Rubens");
		p2.setIdade(50);
		p2.setSalario(4000);
		p2.setBonus(800);
		p2.setDesconto(200);
		p2.imprimir();
		
		Professor p3 = new Professor("Thiago", 35, 3500, 700, 150);
		p3.imprimir();

		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
		}
	
}
