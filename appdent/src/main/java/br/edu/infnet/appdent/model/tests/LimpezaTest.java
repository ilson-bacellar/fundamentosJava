package br.edu.infnet.appdent.model.tests;

import br.edu.infnet.appdent.model.auxiliar.Constante;
import br.edu.infnet.appdent.model.domain.Limpeza;

public class LimpezaTest {


public static void main(String[] args) {
		
		Limpeza l1 = new Limpeza("Limpeza", "flúor", 300);
		l1.setDessensibilizacao(true);
		l1.setClareamento(false);
		l1.setPeriodontia(false);
		l1.imprimir();
		
		Limpeza l2 = new Limpeza("Limpeza", "bicarbonato", 200);
		l2.setDessensibilizacao(false);
		l2.setClareamento(true);
		l2.setPeriodontia(false);
		l2.imprimir();
				
		Limpeza l3 = new Limpeza("Limpeza", "tártaro", 500, true, true, true);
		l3.imprimir();
		
		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
	}
	
}
