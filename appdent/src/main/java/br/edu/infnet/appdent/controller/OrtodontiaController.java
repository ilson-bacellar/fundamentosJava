package br.edu.infnet.appdent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdent.model.domain.Ortodontia;
import br.edu.infnet.appdent.model.service.OrtodontiaService;



@Controller
public class OrtodontiaController {
	
	private OrtodontiaService ortodontiaService;
	
	private String msg;

	@GetMapping(value = "/ortodontia")
	public String telaCadastro() {
		return "ortodontia/cadastro";
	}
	
	@GetMapping(value = "/ortodontia/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("ortodontias", ortodontiaService.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "ortodontia/lista";
	}
	
	@PostMapping(value = "/ortodontia/incluir")
	public String incluir(Ortodontia ortodontia) {
		
		ortodontiaService.incluir(ortodontia);
		
		msg = "A inclusão do serviço de ortodontia "+ortodontia.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/ortodontia/lista";
	}
	
	@GetMapping(value = "/ortodontia/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Ortodontia ortodontia = ortodontiaService.excluir(id);
		msg = "A exclusão do serviço de ortodontia "+ortodontia.getNome()+" foi realizada com sucesso!";

		return "redirect:/ortodontia/lista";
	}

}
