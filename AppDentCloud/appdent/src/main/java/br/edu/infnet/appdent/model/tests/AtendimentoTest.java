package br.edu.infnet.appdent.model.tests;

import br.edu.infnet.appdent.model.auxiliar.Constante;
import br.edu.infnet.appdent.model.domain.Atendimento;

public class AtendimentoTest {

public static void main(String[] args) {
		
		
		Atendimento a1 = new Atendimento();
		a1.setId(1);
		a1.setData(null);
		a1.setPagamento(false);
		a1.imprimir();
		
		Atendimento a2 = new Atendimento(2, null, true);
		a2.setObs("Colagem dos brackets");
		a2.imprimir();
				
		Atendimento a3 = new Atendimento(3, null, true, "Sessão 3/3: Restauração");
		a3.imprimir();
		
		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
	}
	
}
