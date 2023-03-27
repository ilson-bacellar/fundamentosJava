package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.repository.LLimpezaRepository;
import br.edu.infnet.appdent.model.repository.LimpezaRepository;


@Service
public class LimpezaService {

	@Autowired
	private LimpezaRepository limpezaRepository;
	
	public Limpeza incluir(Limpeza limpeza) {
		return limpezaRepository.save(limpeza);
	}
	
	public void excluir(Integer id) {
		limpezaRepository.deleteById(id);
	}
	
	public Collection<Limpeza> obterLista(){
		return (Collection<Limpeza>) limpezaRepository.findAll();
	}
	
	public Limpeza obterPorId(Integer id) {
		return limpezaRepository.findById(id).orElse(null);
	}

	
}
