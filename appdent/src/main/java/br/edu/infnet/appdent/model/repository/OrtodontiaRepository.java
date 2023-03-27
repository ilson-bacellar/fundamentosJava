package br.edu.infnet.appdent.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Ortodontia;

@Repository
public interface OrtodontiaRepository extends CrudRepository<Ortodontia, Integer>{

}
