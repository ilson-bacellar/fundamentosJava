package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.repository.LimpezaRepository;


@Service
public class LimpezaService {

	@Autowired
	private LimpezaRepository limpezaRepository;
	
	public boolean incluir(Limpeza limpeza) {
		return limpezaRepository.incluir(limpeza);
	}
	
	public Limpeza excluir(Integer key) {
		return limpezaRepository.excluir(key);
	}
	
	public Collection<Limpeza> obterLista(){
		return limpezaRepository.obterLista();
	}

	
}
