package br.edu.infnet.appdent.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Canal;

@Repository
public interface CanalRepository extends CrudRepository<Canal, Integer>{

	@Query("from Canal c where c.usuario.id =:userId")
	List<Canal> obterLista(Integer userId, Sort sort);
	
}
