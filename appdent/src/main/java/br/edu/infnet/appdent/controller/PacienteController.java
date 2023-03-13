package br.edu.infnet.appdent.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appdent.exceptions.NomeIncompletoException;
import br.edu.infnet.appdent.model.domain.Paciente;
import br.edu.infnet.appdent.model.service.PacienteService;



@Controller
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	private String msg;

	@GetMapping(value = "/paciente")
	public String telaCadastro() {
		return "paciente/cadastro";
	}
	
	@GetMapping(value = "/paciente/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("pacientes", pacienteService.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "paciente/lista";
	}
	
	@PostMapping(value = "/paciente/incluir")
	public String incluir(Paciente paciente) throws NomeIncompletoException {
		
		pacienteService.incluir(paciente);
		
		msg = "A inclusão do paciente "+paciente.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/paciente/lista";
	}
	
	@GetMapping(value = "/paciente/{id}/excluir")
	public String excluir(@PathVariable Integer id) throws NomeIncompletoException {

		Paciente paciente = pacienteService.excluir(id);
		msg = "A exclusão do paciente "+paciente.getNome()+" foi realizada com sucesso!";
		
		return "redirect:/paciente/lista";
	}

}
