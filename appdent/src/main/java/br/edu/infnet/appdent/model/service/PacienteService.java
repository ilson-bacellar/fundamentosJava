package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Paciente;
import br.edu.infnet.appdent.model.domain.Servico;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.repository.PacienteRepository;
import br.edu.infnet.appdent.model.repository.SPacienteRepository;





@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public Paciente incluir(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public void excluir(Integer key) {
		pacienteRepository.deleteById(key);
	}
	
	public Collection<Paciente> obterLista(){
		return (Collection<Paciente>) pacienteRepository.findAll();
	}
	
	public Collection<Paciente> obterLista(Usuario usuario){
		return (Collection<Paciente>) pacienteRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

}
