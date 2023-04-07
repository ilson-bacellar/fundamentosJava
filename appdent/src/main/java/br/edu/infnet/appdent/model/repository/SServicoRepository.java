package br.edu.infnet.appdent.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Servico;


@Repository
public class SServicoRepository {

	private static Integer id = 1;
	
	private static Map<Integer, Servico> mapaServico = new HashMap<Integer, Servico>();

	public boolean incluir(Servico servico) {
		
		servico.setId(id++);

		try {
			mapaServico.put(servico.getId(), servico);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Servico excluir(Integer key) {

		return mapaServico.remove(key);
	}

	public Collection<Servico> obterLista(){
		return mapaServico.values();
	}
	
}
