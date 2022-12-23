package br.edu.infnet.app.testes;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.dominio.Atendimento;

public class AtendimentoTeste {
	
public static void main(String[] args) {
		
		
		Atendimento a1 = new Atendimento();
		a1.setId("001");
		a1.setData("10/10/2022");
		a1.setPagamento(false);
		a1.imprimir();
		
		Atendimento a2 = new Atendimento("002", "11/10/2022", true);
		a2.setObs("Colagem dos brackets");
		a2.imprimir();
				
		Atendimento a3 = new Atendimento("003", "12/10/2022", true, "Sess�o 3/3: Restaura��o");
		a3.imprimir();
		
		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
	}

}
