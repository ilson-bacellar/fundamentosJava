package br.edu.infnet.appdent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.service.LimpezaService;


@Controller
public class LimpezaController {
	
	@Autowired
	private LimpezaService limpezaService;
	
	private String msg;

	@GetMapping(value = "/limpeza")
	public String telaCadastro() {
		return "limpeza/cadastro";
	}
	
	@GetMapping(value = "/limpeza/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("limpezas", limpezaService.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "limpeza/lista";
	}
	
	@PostMapping(value = "/limpeza/incluir")
	public String incluir(Limpeza limpeza) {
		
		limpezaService.incluir(limpeza);
		
		msg = "A inclusão do serviço de limpeza "+limpeza.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/limpeza/lista";
	}
	
	@GetMapping(value = "/limpeza/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Limpeza limpeza = limpezaService.excluir(id);
		msg = "A exclusão do serviço de limpeza "+limpeza.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/limpeza/lista";
	}


}
