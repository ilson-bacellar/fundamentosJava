package br.edu.infnet.appdent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.domain.Paciente;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.repository.LimpezaRepository;
import br.edu.infnet.appdent.model.service.LimpezaService;

@Order(3)
@Component
public class LimpezaLoader implements ApplicationRunner{
	
	@Autowired
	private LimpezaService limpezaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario admin = new Usuario();
		admin.setId(1);
		
		Limpeza limpeza = new Limpeza("Limpeza", "flúor", 300);
		limpeza.setDessensibilizacao(true);
		limpeza.setClareamento(false);
		limpeza.setPeriodontia(false);
		limpeza.setUsuario(admin);
		limpeza.imprimir();
		
		limpezaService.incluir(limpeza);
		
		Limpeza l2 = new Limpeza("Limpeza", "bicarbonato", 200);
		l2.setDessensibilizacao(false);
		l2.setClareamento(true);
		l2.setPeriodontia(false);
		l2.setUsuario(admin);
		l2.imprimir();
		
		limpezaService.incluir(l2);
		
		Limpeza l3 = new Limpeza("Limpeza", "tártaro", 500);
		l3.setDessensibilizacao(true);
		l3.setClareamento(true);
		l3.setPeriodontia(true);
		l3.setUsuario(admin);
		l3.imprimir();
		
		limpezaService.incluir(l3);
		
		
//		try {
//			String arq = "limpezas.txt";
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
//					Limpeza limpeza = new Limpeza(campos[0], campos[1], Float.valueOf(campos[2]));
//					limpeza.setId(1);
//					limpezaService.incluir(limpeza);
//					
//					System.out.println("Inclusão do serviço de limpeza realizada com sucesso!");
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
