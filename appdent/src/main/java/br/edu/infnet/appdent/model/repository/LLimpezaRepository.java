package br.edu.infnet.appdent.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Limpeza;

@Repository
public class LLimpezaRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, Limpeza> mapaLimpeza = new HashMap<Integer, Limpeza>();

	public boolean incluir(Limpeza limpeza) {
		
		limpeza.setId(id++);

		try {
			mapaLimpeza.put(limpeza.getId(), limpeza);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Limpeza excluir(Integer key) {

		return mapaLimpeza.remove(key);
	}

	public Collection<Limpeza> obterLista(){
		return mapaLimpeza.values();
	}

}
