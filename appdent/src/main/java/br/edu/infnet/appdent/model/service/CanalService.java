package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Canal;
import br.edu.infnet.appdent.model.repository.CanalRepository;


@Service
public class CanalService {

	@Autowired
	private CanalRepository canalRepository;
	
	public boolean incluir(Canal canal) {
		return canalRepository.incluir(canal);
	}
	
	public Canal excluir(Integer key) {
		return canalRepository.excluir(key);
	}
	
	public Collection<Canal> obterLista(){
		return canalRepository.obterLista();
	}
	
}
