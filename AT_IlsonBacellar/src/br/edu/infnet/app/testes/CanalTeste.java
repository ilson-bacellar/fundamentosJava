package br.edu.infnet.app.testes;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.dominio.Canal;

public class CanalTeste {
	
	public static void main(String[] args) {
		
		Canal c1 = new Canal("Canal", "1º molar inferior direito", 1000);
		c1.setNumeroSessoes(3);
		c1.setTipoRestauracao("amálgama");
		c1.setTipoCoroa("zircônia");
		c1.imprimir();
		
		Canal c2 = new Canal("Canal", "2º molar superior esquerdo", 900);
		c2.setNumeroSessoes(2);
		c2.setTipoRestauracao("ouro");
		c2.setTipoCoroa("cerâmica");
		c2.imprimir();
				
		Canal c3 = new Canal("Canal", "incisivo lateral inferior esquerdo", 800, 1, "porcelana", "resina");
		c3.imprimir();
		
		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
	}

}
