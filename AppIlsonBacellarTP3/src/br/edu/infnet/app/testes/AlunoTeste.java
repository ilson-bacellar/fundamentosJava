package br.edu.infnet.app.testes;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.dominio.Aluno;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("Carlos Augusto da Silva Barros");
		a1.setAv1(6);
		a1.setAv2(8);
		a1.imprimir();
		
		Aluno a2 = new Aluno("Paulo Ferreira de Souza");
		a2.setAv1(8);
		a2.setAv2(7);
		a2.imprimir();
		
		Aluno a3 = new Aluno("Claudia Tavares da Cunha", 7, 6);
		a3.imprimir();

		System.out.println(Constante.PROCESSAMENTO_FINALIZADO);
		}

}
