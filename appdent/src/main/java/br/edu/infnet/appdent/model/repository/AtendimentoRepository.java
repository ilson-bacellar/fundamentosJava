package br.edu.infnet.appdent.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Atendimento;







@Repository
public class AtendimentoRepository {

private static Integer id = 1;
	
	private static Map<Integer, Atendimento> mapaAtendimento = new HashMap<Integer, Atendimento>();

	public boolean incluir(Atendimento atendimento) {
		
		atendimento.setId(id++);

		try {
			mapaAtendimento.put(atendimento.getId(), atendimento);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Atendimento excluir(Integer key) {

		return mapaAtendimento.remove(key);
	}

	public Collection<Atendimento> obterLista(){
		return mapaAtendimento.values();
	}
	
}
