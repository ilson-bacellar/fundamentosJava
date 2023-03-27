package br.edu.infnet.appdent.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Limpeza;

@Repository
public interface LimpezaRepository extends CrudRepository<Limpeza, Integer>{

}
