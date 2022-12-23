package br.edu.infnet.app.testes;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.dominio.Professor;

public class ProfessorTeste {

public static void main(String[] args) {
		
		
		try {
			Professor p1 = new Professor();
			p1.setNome("Raimundo Silva Pinto");
			p1.setIdade(40);
			p1.setSalario(5000);
			p1.setBonus(1000);
			p1.setDesconto(300);
			p1.imprimir();
		} catch (Exception e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		try {
			Professor p2 = new Professor("Jos� Bezerra Bastos");
			p2.setIdade(50);
			p2.setSalario(4000);
			p2.setBonus(800);
			p2.setDesconto(200);
			p2.imprimir();
		} catch (Exception e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		try {
			Professor p3 = new Professor(null, 35, 3500, 700, 150);
			p3.imprimir();
		} catch (Exception e) {
			System.out.println("[ERROR] " + e.getMessage());
		}

		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
		}
	
}
