package br.edu.infnet.appdent.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Canal;

@Repository
public interface CanalRepository extends CrudRepository<Canal, Integer>{

}
