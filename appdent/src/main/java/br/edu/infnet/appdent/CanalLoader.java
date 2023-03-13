package br.edu.infnet.appdent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdent.model.domain.Canal;
import br.edu.infnet.appdent.model.service.CanalService;





@Component
public class CanalLoader implements ApplicationRunner{

	@Autowired
	private CanalService canalService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		try {
			String arq = "canais.txt";
			
			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);
				
				String linha = leitura.readLine();			
				String[] campos = null;

				while(linha != null) {
					
					campos = linha.split(";");
					
					Canal canal = new Canal(campos[0], campos[1], Float.valueOf(campos[2]);
					canal.setId(1);
					canalService.incluir(canal);
					
					System.out.println("Inclusão do serviço de canal realizada com sucesso!");

					linha = leitura.readLine();
				}
				
				leitura.close();
				fileR.close();
			} catch (IOException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} 
			
		} finally {
			System.out.println("Processamento realizado com sucesso!!!");
		}		
		
	}
	
}
