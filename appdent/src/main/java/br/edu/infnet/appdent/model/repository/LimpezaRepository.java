package br.edu.infnet.appdent.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.edu.infnet.appdent.model.domain.Limpeza;

@Repository
public interface LimpezaRepository extends CrudRepository<Limpeza, Integer>{

	@Query("from Limpeza l where l.usuario.id =:userId")
	List<Limpeza> obterLista(Integer userId, Sort sort);
		
}
