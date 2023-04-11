package br.edu.infnet.appdent.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Paciente;

@Repository
public class SPacienteRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, Paciente> mapaPaciente = new HashMap<Integer, Paciente>();

	public boolean incluir(Paciente paciente) {
		
		paciente.setId(id++);

		try {
			mapaPaciente.put(paciente.getId(), paciente);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Paciente excluir(Integer key) {

		return mapaPaciente.remove(key);
	}

	public Collection<Paciente> obterLista(){
		return mapaPaciente.values();
	}

}
