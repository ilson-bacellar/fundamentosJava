package br.edu.infnet.appdent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
			
		for (int i = 0; i < 10; i++) {
			Usuario usuario = new Usuario("Administrador " + i, "admin"+i+"@admin.com", "0"+i);
			
			usuarioService.incluir(usuario);
		
			System.out.println("Inclusão do usuário "+usuario.getNome()+" realizada com sucesso!");
		}		
		
	}

}
