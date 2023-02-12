package br.edu.infnet.appdent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import br.edu.infnet.appdent.model.domain.Usuario;

@Controller
public class AppController {

	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}
}
