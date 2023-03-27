package br.edu.infnet.appdent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import br.edu.infnet.appdent.model.domain.Ortodontia;
import br.edu.infnet.appdent.model.repository.LimpezaRepository;
import br.edu.infnet.appdent.model.repository.OrtodontiaRepository;
import br.edu.infnet.appdent.model.service.OrtodontiaService;


@Order(4)
@Component
public class OrtodontiaLoader implements ApplicationRunner{
	
	@Autowired
	private OrtodontiaService ortodontiaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		Ortodontia ortodontia = new Ortodontia("Aparelho", "estético", 5000);
		ortodontia.setManutencao(600);
		ortodontia.setDuracaoEmMeses(48);
		ortodontia.setMicroimplante(true);
		ortodontia.imprimir();
		
		ortodontiaService.incluir(ortodontia);
		
		
		
//		try {
//			String arq = "ortodontias.txt";
//			
//			try {
//				FileReader fileR = new FileReader(arq);
//				BufferedReader leitura = new BufferedReader(fileR);
//				
//				String linha = leitura.readLine();			
//				String[] campos = null;
//
//				while(linha != null) {
//					
//					campos = linha.split(";");
//					
//					Ortodontia ortodontia = new Ortodontia(campos[0], campos[1], Float.valueOf(campos[2]));
//					ortodontia.setId(1);
//					ortodontiaService.incluir(ortodontia);
//					
//					System.out.println("Inclusão do serviço de ortodontia realizada com sucesso!");
//
//					linha = leitura.readLine();
//				}
//				
//				leitura.close();
//				fileR.close();
//			} catch (IOException e) {
//				System.out.println("[ERRO] " + e.getMessage());
//			} 
//			
//		} finally {
//			System.out.println("Processamento realizado com sucesso!!!");
//		}		
		
		
		
		
		
		
		
		
		
	}

}
