package br.edu.infnet.app.testes;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.dominio.Ortodontia;

public class OrtodontiaTeste {
	
	public static void main(String[] args) {
	
	Ortodontia o1 = new Ortodontia("Aparelho", "estético", 5000);
	o1.setManutencao(600);
	o1.setDuracaoEmMeses(48);
	o1.setMicroimplante(true);
	o1.imprimir();
	
	Ortodontia o2 = new Ortodontia("Aparelho", "simples", 4000);
	o2.setManutencao(500);
	o2.setDuracaoEmMeses(36);
	o2.setMicroimplante(false);
	o2.imprimir();
	
	Ortodontia o3 = new Ortodontia("Aparelho", "móvel", 3000, 400, 24, false);
	o3.imprimir();

	System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
	}
}
