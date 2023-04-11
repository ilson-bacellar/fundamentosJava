package br.edu.infnet.appdent.model.tests;

import br.edu.infnet.appdent.exceptions.NomeIncompletoException;
import br.edu.infnet.appdent.exceptions.TelefoneInvalidoException;
import br.edu.infnet.appdent.model.auxiliar.Constante;
import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.domain.Ortodontia;
import br.edu.infnet.appdent.model.domain.Paciente;
import br.edu.infnet.appdent.model.domain.Servico;

public class PacienteTest {
	
	public static void main(String[] args) {
		
		Limpeza l1 = new Limpeza("Limpeza", "flúor", 300);
		l1.setDessensibilizacao(true);
		l1.setClareamento(false);
		l1.setPeriodontia(false);
	
		Ortodontia o3 = new Ortodontia("Aparelho", "móvel", 3000, 400, 24, false);

		Servico[] pacienteServicos = new Servico[2];
	
		pacienteServicos[0] = l1;
		pacienteServicos[1] = o3;
	
		try {
			Paciente p1 = new Paciente();
			p1.setNome("Carlos Augusto da Silva Barros");
			p1.setTelefone("22222222");
			p1.setProntuario("20 anos; alérgico a penicilina; sisos extraídos");
			p1.setServicos(pacienteServicos);
			p1.imprimir();
		} catch (NomeIncompletoException | TelefoneInvalidoException e) {
			System.out.println("[ERROR] " + e.getMessage() +"\n");
		}
		
		
		try {
			Paciente p2 = new Paciente("Paulo Ferreira de Souza", "3333");
			p2.setNome("Paulo Ferreira de Souza");
			p2.setTelefone("3333");
			p2.setProntuario("59 anos; cardíaco; canal incisivo lateral direito superior");
			p2.imprimir();
		} catch (NomeIncompletoException | TelefoneInvalidoException e) {
			System.out.println("[ERROR] " + e.getMessage() +"\n");
		}
				
		
		try {
			Paciente p3 = new Paciente(null, "44444444", "32 anos; clareamento em 24.05.2022");
			p3.imprimir();
		} catch (NomeIncompletoException | TelefoneInvalidoException e) {
			System.out.println("[ERROR] " + e.getMessage() +"\n");
		}
		
		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
	}
	
	
}
