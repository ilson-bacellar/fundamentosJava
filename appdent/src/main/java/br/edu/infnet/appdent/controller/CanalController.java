package br.edu.infnet.appdent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appdent.model.domain.Canal;
import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.service.CanalService;




@Controller
public class CanalController {
	
	@Autowired
	private CanalService canalService;
	
	private String msg;

	@GetMapping(value = "/canal")
	public String telaCadastro() {
		return "canal/cadastro";
	}
	
	@GetMapping(value = "/canal/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		
		model.addAttribute("canais", canalService.obterLista(usuario));
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "canal/lista";
	}
	
	@PostMapping(value = "/canal/incluir")
	public String incluir(Canal canal, @SessionAttribute("usuario") Usuario usuario) {
		
		canal.setUsuario(usuario);
		
		canalService.incluir(canal);
		
		msg = "A inclusão do serviço de canal "+canal.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/canal/lista";
	}
	
	@GetMapping(value = "/canal/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Canal canal = canalService.obterPorId(id);

		try {
			canalService.excluir(id);
			
			msg = "A exclusão do serviço "+canal.getNome()+" foi realizada com sucesso!";
		} catch (Exception e) {
			msg = "Impossível excluir o serviço "+canal.getNome()+"!";
		}
		return "redirect:/canal/lista";
	}

}
