package br.edu.infnet.appdent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.domain.Ortodontia;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.service.OrtodontiaService;



@Controller
public class OrtodontiaController {
	
	@Autowired
	private OrtodontiaService ortodontiaService;
	
	private String msg;

	@GetMapping(value = "/ortodontia")
	public String telaCadastro() {
		return "ortodontia/cadastro";
	}
	
	@GetMapping(value = "/ortodontia/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		
		model.addAttribute("ortodontias", ortodontiaService.obterLista(usuario));
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "ortodontia/lista";
	}
	
	@PostMapping(value = "/ortodontia/incluir")
	public String incluir(Ortodontia ortodontia, @SessionAttribute("usuario") Usuario usuario) {
		
		ortodontia.setUsuario(usuario);
		
		ortodontiaService.incluir(ortodontia);
		
		msg = "A inclusão do serviço de ortodontia "+ortodontia.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/ortodontia/lista";
	}
	
	@GetMapping(value = "/ortodontia/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Ortodontia ortodontia = ortodontiaService.obterPorId(id);
		
		try {
			ortodontiaService.excluir(id);
			
			msg = "A exclusão do serviço "+ortodontia.getNome()+" foi realizada com sucesso!";
		} catch (Exception e) {
			msg = "Impossível excluir o serviço "+ortodontia.getNome()+"!";
		}
		return "redirect:/ortodontia/lista";
	}

}
