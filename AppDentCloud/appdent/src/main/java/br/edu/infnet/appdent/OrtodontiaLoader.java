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
import br.edu.infnet.appdent.model.domain.Usuario;
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
		
		Usuario admin = new Usuario();
		admin.setId(1);
		
		
		Ortodontia ortodontia = new Ortodontia("Aparelho", "Estetico", 5000);
		ortodontia.setManutencao(600);
		ortodontia.setDuracaoEmMeses(48);
		ortodontia.setMicroimplante(true);
		ortodontia.setUsuario(admin);
		ortodontia.imprimir();
		
		ortodontiaService.incluir(ortodontia);
		
		Ortodontia o2 = new Ortodontia("Aparelho", "Metal", 4000);
		o2.setManutencao(500);
		o2.setDuracaoEmMeses(36);
		o2.setMicroimplante(false);
		o2.setUsuario(admin);
		o2.imprimir();
		
		ortodontiaService.incluir(o2);
		
		Ortodontia o3 = new Ortodontia("Aparelho", "Movel", 3000);
		o3.setManutencao(400);
		o3.setDuracaoEmMeses(24);
		o3.setMicroimplante(false);
		o3.setUsuario(admin);
		o3.imprimir();
		
		ortodontiaService.incluir(o3);
		
		
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
