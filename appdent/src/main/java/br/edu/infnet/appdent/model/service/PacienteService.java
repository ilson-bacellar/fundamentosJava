package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Paciente;
import br.edu.infnet.appdent.model.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public boolean incluir(Paciente paciente) {
		return pacienteRepository.incluir(paciente);
	}
	
	public Paciente excluir(Integer key) {
		return pacienteRepository.excluir(key);
	}
	
	public Collection<Paciente> obterLista(){
		return pacienteRepository.obterLista();
	}

}
