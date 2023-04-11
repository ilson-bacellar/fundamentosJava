package br.edu.infnet.appdent.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Ortodontia;

@Repository
public interface OrtodontiaRepository extends CrudRepository<Ortodontia, Integer>{
	
	@Query("from Ortodontia o where o.usuario.id =:userId")
	List<Ortodontia> obterLista(Integer userId, Sort sort);

}
