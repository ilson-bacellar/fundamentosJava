package br.edu.infnet.appdent.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Paciente;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer>{

}
