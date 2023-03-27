package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.domain.Ortodontia;
import br.edu.infnet.appdent.model.repository.OOrtodontiaRepository;
import br.edu.infnet.appdent.model.repository.OrtodontiaRepository;



@Service
public class OrtodontiaService {
	
	@Autowired
	private OrtodontiaRepository ortodontiaRepository;
	
	public Ortodontia incluir(Ortodontia ortodontia) {
		return ortodontiaRepository.save(ortodontia);
	}
	
	public void excluir(Integer id) {
		ortodontiaRepository.deleteById(id);
	}
	
	public Collection<Ortodontia> obterLista(){
		return (Collection<Ortodontia>) ortodontiaRepository.findAll();
	}
	
	public Ortodontia obterPorId(Integer id) {
		return ortodontiaRepository.findById(id).orElse(null);
	}
}
