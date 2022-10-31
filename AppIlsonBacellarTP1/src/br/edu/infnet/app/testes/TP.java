package br.edu.infnet.app.testes;

import java.util.Scanner;

// Aluno: Ilson de Bacellar e Souza Junior

public class TP {

	private static String[] nomes;
	private static float[] av1s;
	private static float[] av2s;
	

	private static final int TAMANHO = 100;		

	private static void imprimir() {		
		for (int i = 0; i < TAMANHO; i++) {
			if(nomes[i] != null) {
				imprimir(i);
			}
		}
	}

	private static void imprimirNumeroRegistro(int indice) {
		
		System.out.println("Número do registro aluno: "+indice+""
							);
	}
	
	private static void imprimir(int indice) {
		float media = calcularMedia(indice);
		
		System.out.println(	"Nome do aluno: " + nomes[indice] + " | " + 
							"Nota da AV1: " + av1s[indice] + " | " + 
							"Nota da AV2: " + av2s[indice]  + " | " + 
							"Média final: " + media + " | " + 
							"Situação: " + obterSituacao(media)
							);
	}
	
	private static float calcularMedia(int indice){
		return (av1s[indice] + av2s[indice]) / 2;
	}
	
	private static String obterSituacao(float med){		
		if(med < 4) {
			return "Reprovado";
		} if (med >= 4 && med < 7) {
			return "Prova final";
			}
				return "Aprovado";
	}

	public static void main(String[] args) {
		nomes = new String[TAMANHO];
		av1s = new float[TAMANHO];
		av2s = new float[TAMANHO];
		
		Scanner in = new Scanner(System.in);
		
		String opcao;
		int pos = 0;

		do {
			System.out.println("[1] Registrar as notas de um novo aluno.");
			System.out.println("[2] Consultar boletim de um aluno.");
			System.out.println("[3] Consultar notas da turma.");
			System.out.println("[4] Sair.");
			
			System.out.print("Informe a opção desejada: ");						
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				if(pos < TAMANHO) {
					System.out.print("Informe o nome do aluno: ");	
					nomes[pos] = in.next();
	
					System.out.print("Informe a nota da AV1: ");	
					av1s[pos] = in.nextInt();
	
					System.out.print("Informe a nota da AV2: ");	
					av2s[pos] = in.nextFloat();
					
					imprimirNumeroRegistro(pos);

					pos++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}
				break;

			case "2":
				System.out.print("Informe o código de registro do aluno para consulta: ");						
				int id = in.nextInt();

				imprimir(id);
				break;

			case "3":
				imprimir();
				break;

			case "4":
				System.out.println("Saída");
				break;

			default:
				break;
			}
		} while (!"4".equalsIgnoreCase(opcao));
				
		System.out.println("Processamento finalizado!!!");
		
		in.close();
	}
}
