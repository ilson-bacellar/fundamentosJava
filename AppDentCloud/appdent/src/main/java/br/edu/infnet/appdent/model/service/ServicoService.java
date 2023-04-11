package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Limpeza;
import br.edu.infnet.appdent.model.domain.Servico;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.repository.SServicoRepository;
import br.edu.infnet.appdent.model.repository.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;
	
	public void excluir(Integer id) {
		servicoRepository.deleteById(id);
	}
	
	public Collection<Servico> obterLista(){
		return (Collection<Servico>) servicoRepository.findAll();
	}
	
	public Collection<Servico> obterLista(Usuario usuario){
		return (Collection<Servico>) servicoRepository.obterLista(usuario.getId());
	}
	
	public Servico obterPorId(Integer id) {
		return servicoRepository.findById(id).orElse(null);
	}
	
}
