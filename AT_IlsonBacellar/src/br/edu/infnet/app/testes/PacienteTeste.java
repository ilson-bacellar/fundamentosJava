package br.edu.infnet.app.testes;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.dominio.Limpeza;
import br.edu.infnet.app.dominio.Ortodontia;
import br.edu.infnet.app.dominio.Paciente;
import br.edu.infnet.app.dominio.Servico;


public class PacienteTeste {

public static void main(String[] args) {
		
		Limpeza l1 = new Limpeza("Limpeza", "flúor", 300);
		l1.setDessensibilizacao(true);
		l1.setClareamento(false);
		l1.setPeriodontia(false);
	
		Ortodontia o3 = new Ortodontia("Aparelho", "móvel", 3000, 400, 24, false);

		Servico[] pacienteServicos = new Servico[2];
	
		pacienteServicos[0] = l1;
		pacienteServicos[1] = o3;
	
		Paciente p1 = new Paciente();
		p1.setNome("Carlos Augusto da Silva Barros");
		p1.setTelefone("22222222");
		p1.setProntuario("20 anos; alérgico a penicilina; sisos extraídos");
		p1.setServicos(pacienteServicos);
		p1.imprimir();
		
		Paciente p2 = new Paciente("Paulo Ferreira de Souza", "33333333");
		p2.setProntuario("59 anos; cardíaco; canal incisivo lateral direito superior");
		p2.imprimir();
				
		Paciente p3 = new Paciente("Claudia Tavares da Cunha", "44444444", "32 anos; clareamento em 24.05.2022");
		p3.imprimir();
		
		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
	}
	
}
