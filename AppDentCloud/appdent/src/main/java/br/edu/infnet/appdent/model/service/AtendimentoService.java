package br.edu.infnet.appdent.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appdent.model.domain.Atendimento;
import br.edu.infnet.appdent.model.domain.Usuario;
import br.edu.infnet.appdent.model.repository.AtendimentoRepository;


@Service
public class AtendimentoService {

	@Autowired
	private AtendimentoRepository atendimentoRepository;
	
	public Atendimento incluir(Atendimento atendimento) {
		return atendimentoRepository.save(atendimento);
	}
	
	public void excluir(Integer id) {
		atendimentoRepository.deleteById(id);
	}
	
	public Collection<Atendimento> obterLista(){
		return (Collection<Atendimento>) atendimentoRepository.findAll();
	}
	
	public Collection<Atendimento> obterLista(Usuario usuario){
		return (Collection<Atendimento>) atendimentoRepository.obterLista(usuario.getId());
	}
	
	public Atendimento obterPorId(Integer id) {
		return atendimentoRepository.findById(id).orElse(null);
	}
	
}
