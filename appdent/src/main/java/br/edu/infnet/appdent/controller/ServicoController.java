package br.edu.infnet.appdent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdent.exceptions.NomeIncompletoException;
import br.edu.infnet.appdent.model.domain.Paciente;
import br.edu.infnet.appdent.model.domain.Servico;
import br.edu.infnet.appdent.model.service.ServicoService;

@Controller
public class ServicoController {

	private ServicoService servicoService;
	
	private String msg;

	@GetMapping(value = "/servico")
	public String telaCadastro() {
		return "servico/cadastro";
	}
	
	@GetMapping(value = "/servico/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("servicos", servicoService.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "servico/lista";
	}
	
	@PostMapping(value = "/servico/incluir")
	public String incluir(Servico servico) {
		
		servicoService.incluir(servico);
		
		msg = "A inclusão do serviço "+servico.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/servico/lista";
	}
	
	@GetMapping(value = "/servico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Servico servico = servicoService.excluir(id);
		msg = "A exclusão do serviço "+servico.getNome()+" foi realizada com sucesso!";
		
		msg = "A exclusão do serviço foi realizada com sucesso!";

		return "redirect:/servico/lista";
	}
	
}
