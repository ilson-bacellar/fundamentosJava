package br.edu.infnet.appdent.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Canal;


@Repository
public class CanalRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, Canal> mapaCanal = new HashMap<Integer, Canal>();

	public boolean incluir(Canal canal) {
		
		canal.setId(id++);

		try {
			mapaCanal.put(canal.getId(), canal);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Canal excluir(Integer key) {

		return mapaCanal.remove(key);
	}

	public Collection<Canal> obterLista(){
		return mapaCanal.values();
	}

}
