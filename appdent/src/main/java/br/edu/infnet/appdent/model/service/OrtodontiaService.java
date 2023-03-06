package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Ortodontia;
import br.edu.infnet.appdent.model.repository.OrtodontiaRepository;



@Service
public class OrtodontiaService {
	
	@Autowired
	private OrtodontiaRepository ortodontiaRepository;
	
	public boolean incluir(Ortodontia ortodontia) {
		return ortodontiaRepository.incluir(ortodontia);
	}
	
	public Ortodontia excluir(Integer key) {
		return ortodontiaRepository.excluir(key);
	}
	
	public Collection<Ortodontia> obterLista(){
		return ortodontiaRepository.obterLista();
	}

}
