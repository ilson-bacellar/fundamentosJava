package br.edu.infnet.appdent.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdent.model.domain.Atendimento;
import br.edu.infnet.appdent.model.service.AtendimentoService;


@Controller
public class AtendimentoController {
	
	private AtendimentoService atendimentoService;
	
	private String msg;

	@GetMapping(value = "/atendimento")
	public String telaCadastro() {
		return "atendimento/cadastro";
	}
	
	@GetMapping(value = "/atendimento/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("atendimentos", atendimentoService.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "atendimento/lista";
	}
	
	@PostMapping(value = "/atendimento/incluir")
	public String incluir(Atendimento atendimento) {
		
		atendimentoService.incluir(atendimento);
		
		msg = "A inclusão do atendimento "+atendimento.getId()+" foi realizada com sucesso!";
		
		return "redirect:/atendimento/lista";
	}
	
	@GetMapping(value = "/atendimento/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Atendimento atendimento = atendimentoService.excluir(id);
		msg = "A exclusão do atendimento "+atendimento.getId()+" foi realizada com sucesso!";

		return "redirect:/atendimento/lista";
	}

}
