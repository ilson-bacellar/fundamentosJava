package br.edu.infnet.appdent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdent.model.domain.Servico;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.service.ServicoService;

@Controller
public class ServicoController {

	@Autowired
	private ServicoService servicoService;
	
	private String msg;
	
	@GetMapping(value = "/servico/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		
		model.addAttribute("servicos", servicoService.obterLista(usuario));
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "servico/lista";
	}
	
	@GetMapping(value = "/servico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Servico servico = servicoService.obterPorId(id);
		
		try {
			servicoService.excluir(id);
			
			msg = "A exclusão do serviço "+servico.getNome()+" foi realizada com sucesso!";
		} catch (Exception e) {
			msg = "Impossível excluir o serviço "+servico.getNome()+"!";
		}
				
		return "redirect:/servico/lista";
	}
	
}
