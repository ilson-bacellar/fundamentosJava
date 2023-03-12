package br.edu.infnet.appdent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appdent.model.domain.Paciente;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		try {
			String arq = "pacientes.txt";
			
			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);
				
				String linha = leitura.readLine();			
				String[] campos = null;

				while(linha != null) {
					
					campos = linha.split(";");
					
					Usuario usuario = new Usuario(campos[0], campos[1], campos[2]);
					usuario.setId(1);
					usuarioService.incluir(usuario);
					
					System.out.println("Inclusão do usuário "+usuario.getNome()+" realizada com sucesso!");

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
