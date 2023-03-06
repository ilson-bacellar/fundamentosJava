package br.edu.infnet.appdent.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Ortodontia;

@Repository
public class OrtodontiaRepository {

private static Integer id = 1;
	
	private static Map<Integer, Ortodontia> mapaOrtodontia = new HashMap<Integer, Ortodontia>();

	public boolean incluir(Ortodontia ortodontia) {
		
		ortodontia.setId(id++);

		try {
			mapaOrtodontia.put(ortodontia.getId(), ortodontia);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Ortodontia excluir(Integer key) {

		return mapaOrtodontia.remove(key);
	}

	public Collection<Ortodontia> obterLista(){
		return mapaOrtodontia.values();
	}
	
}
