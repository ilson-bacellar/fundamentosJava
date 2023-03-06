package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Servico;
import br.edu.infnet.appdent.model.repository.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;
	
	public boolean incluir(Servico servico) {
		return servicoRepository.incluir(servico);
	}
	
	public Servico excluir(Integer key) {
		return servicoRepository.excluir(key);
	}
	
	public Collection<Servico> obterLista(){
		return servicoRepository.obterLista();
	}
	
}
