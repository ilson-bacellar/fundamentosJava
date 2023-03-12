package br.edu.infnet.appdent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdent.model.domain.Canal;
import br.edu.infnet.appdent.model.service.CanalService;


@Controller
public class CanalController {
	
	private CanalService canalService;
	
	private String msg;

	@GetMapping(value = "/canal")
	public String telaCadastro() {
		return "canal/cadastro";
	}
	
	@GetMapping(value = "/canal/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("canais", canalService.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "canal/lista";
	}
	
	@PostMapping(value = "/canal/incluir")
	public String incluir(Canal canal) {
		
		canalService.incluir(canal);
		
		msg = "A inclusão do serviço de canal "+canal.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/canal/lista";
	}
	
	@GetMapping(value = "/canal/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Canal canal = canalService.excluir(id);
		msg = "A exclusão do serviço de canal "+canal.getNome()+" foi realizada com sucesso!";

		return "redirect:/canal/lista";
	}

}
