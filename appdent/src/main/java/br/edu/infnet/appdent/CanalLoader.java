package br.edu.infnet.appdent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdent.model.domain.Canal;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.repository.CanalRepository;
import br.edu.infnet.appdent.model.repository.OrtodontiaRepository;
import br.edu.infnet.appdent.model.service.CanalService;




@Order(5)
@Component
public class CanalLoader implements ApplicationRunner{

	@Autowired
	private CanalService canalService;
		
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario admin = new Usuario();
		admin.setId(1);
		
		
			Canal canal = new Canal("Canal", "1º molar inferior direito", 1000);
			canal.setNumeroSessoes(3);
			canal.setTipoRestauracao("amálgama");
			canal.setTipoCoroa("zircônia");
			canal.setUsuario(admin);
			canal.imprimir();
		
			canalService.incluir(canal);
			
			Canal c2 = new Canal("Canal", "2º molar superior esquerdo", 900);
			c2.setNumeroSessoes(2);
			c2.setTipoRestauracao("ouro");
			c2.setTipoCoroa("cerâmica");
			c2.setUsuario(admin);
			c2.imprimir();
			
			canalService.incluir(c2);
						
			Canal c3 = new Canal("Canal", "incisivo lateral inferior esquerdo", 800);
			c3.setNumeroSessoes(1);
			c3.setTipoRestauracao("porcelana");
			c3.setTipoCoroa("resina");
			c3.setUsuario(admin);
			c3.imprimir();
			
			canalService.incluir(c3);
			
			
			
			
		
//		try {
//			String arq = "canais.txt";
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
//					Canal canal = new Canal(campos[0], campos[1], Float.valueOf(campos[2]));
//					canal.setId(1);
//					canalService.incluir(canal);
//					
//					System.out.println("Inclusão do serviço de canal realizada com sucesso!");
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
