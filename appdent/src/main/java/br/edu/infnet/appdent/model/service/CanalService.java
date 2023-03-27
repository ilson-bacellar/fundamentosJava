package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Canal;
import br.edu.infnet.appdent.model.domain.Ortodontia;
import br.edu.infnet.appdent.model.repository.CCanalRepository;
import br.edu.infnet.appdent.model.repository.CanalRepository;


@Service
public class CanalService {

	@Autowired
	private CanalRepository canalRepository;
	
	public Canal incluir(Canal canal) {
		return canalRepository.save(canal);
	}
	
	public void excluir(Integer id) {
		canalRepository.deleteById(id);
	}
	
	public Collection<Canal> obterLista(){
		return (Collection<Canal>) canalRepository.findAll();
	}
	
	public Canal obterPorId(Integer id) {
		return canalRepository.findById(id).orElse(null);
	}
	
}
