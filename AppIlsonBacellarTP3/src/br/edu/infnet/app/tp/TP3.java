package br.edu.infnet.app.tp;

import java.util.Scanner;

import br.edu.infnet.app.auxiliar.Constante;
import br.edu.infnet.app.dominio.Aluno;
import br.edu.infnet.app.dominio.Pessoa;
import br.edu.infnet.app.dominio.Professor;
import br.edu.infnet.app.exceptions.NomeIncompletoException;


public class TP3 {

	private static Pessoa[] pessoas;
	
	private static void imprimir() {		
		for (int i = 0; i < Constante.TAMANHO; i++) {
			if(pessoas[i] != null) {
				pessoas[i].imprimir();
			}
		}
	}

	public static void main(String[] args) {

		pessoas = new Pessoa[Constante.TAMANHO];
		
		Scanner in = new Scanner(System.in);
		
		String opcao;
		int pos = 0;

		do {
			System.out.println("[1] Cadastrar professor");
			System.out.println("[2] Cadastrar aluno");
			System.out.println("[3] Consultar situação de um docente/discente");
			System.out.println("[4] Consultar todos");
			System.out.println("[5] Sair");
			
			System.out.print("Informe a opção desejada: ");						
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				if(pos < Constante.TAMANHO) {
										
					System.out.print("Informe o seu nome: ");	
					String nome = in.next();
					
					Professor prof = new Professor(nome);
	
					System.out.print("Informe a sua idade: ");	
					prof.setIdade(in.nextInt());
	
					System.out.print("Informe o seu salário: ");	
					prof.setSalario(in.nextFloat());
					
					System.out.print("Informe o seu bônus: ");	
					prof.setBonus(in.nextFloat());

					System.out.print("Informe o seu desconto: ");	
					prof.setDesconto(in.nextFloat());
					
					System.out.println("O código dessa pessoa é: " + pos);
					
					pessoas[pos] = prof;
					
					try {
						pessoas[pos].imprimir();
					} catch (NomeIncompletoException e) {
						System.out.println("[ERROR] " + e.getMessage() +"\n");
					}

					pos++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}
				break;

			case "2":
				if(pos < Constante.TAMANHO) {
										
					System.out.print("Informe o seu nome: ");	
					String nome = in.next();		
					
					Aluno alun = new Aluno(nome);
					
					System.out.print("Informe a nota da AV1: ");	
					alun.setAv1(in.nextFloat());
					
					System.out.print("Informe a nota da AV2: ");	
					alun.setAv2(in.nextFloat());
					
					System.out.println("O código dessa pessoa é:" + pos);
					
					pessoas[pos] = alun;
					
					try {
						pessoas[pos].imprimir();
					} catch (NomeIncompletoException e) {
						System.out.println("[ERROR] " + e.getMessage() +"\n");
					}

					pos++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}
				break;

			case "3":
				System.out.print("Informe o funcionário para impressão: ");						
				int id = in.nextInt();

				if(id >= 0 && id < pos) {
					try {
						pessoas[id].imprimir();
					} catch (NomeIncompletoException e) {
						System.out.println("[ERROR] " + e.getMessage() +"\n");
					}
				} else {
					System.out.println("O índice ["+id+"] é inválido!");
				}
				break;

			case "4":
				imprimir();
				break;
			
			case "5":
				System.out.println("Saída");
				break;

			default:
				System.out.println("A opção ["+opcao+"] inválida");
				break;
			}
		} while (!"5".equalsIgnoreCase(opcao));
				
		System.out.println("Processamento finalizado!");
		
		in.close();
	}
	
}
