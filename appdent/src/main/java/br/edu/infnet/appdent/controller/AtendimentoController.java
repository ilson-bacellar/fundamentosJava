package br.edu.infnet.appdent.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdent.model.domain.Atendimento;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.service.AtendimentoService;
import br.edu.infnet.appdent.model.service.PacienteService;


@Controller
public class AtendimentoController {
	
	@Autowired
	private AtendimentoService atendimentoService;
	
	@Autowired
	private PacienteService pacienteService;
	
	private String msg;

	@GetMapping(value = "/atendimento")
	public String telaCadastro(Model model, @SessionAttribute("usuario") Usuario usuario) {
		
		model.addAttribute("pacientes", pacienteService.obterLista(usuario));
		
		return "atendimento/cadastro";
	}
	
	@GetMapping(value = "/atendimento/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		
		model.addAttribute("atendimentos", atendimentoService.obterLista(usuario));
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "atendimento/lista";
	}
	
	@PostMapping(value = "/atendimento/incluir")
	public String incluir(Atendimento atendimento, @SessionAttribute("usuario") Usuario usuario) {
		
		atendimento.setUsuario(usuario);
		
		atendimentoService.incluir(atendimento);
		
		msg = "A inclusão do atendimento "+atendimento.getId()+" foi realizada com sucesso!";
		
		return "redirect:/atendimento/lista";
	}
	
	@GetMapping(value = "/atendimento/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Atendimento atendimento = atendimentoService.obterPorId(id);

		atendimentoService.excluir(id);
		
		msg = "A exclusão do atendimento "+atendimento.getId()+" foi realizada com sucesso!";

		return "redirect:/atendimento/lista";
	}

}
