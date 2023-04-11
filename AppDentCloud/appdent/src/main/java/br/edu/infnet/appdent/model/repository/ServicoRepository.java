package br.edu.infnet.appdent.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.edu.infnet.appdent.model.domain.Servico;

@Repository
public interface ServicoRepository extends CrudRepository<Servico, Integer>{

	@Query("from Servico s where s.usuario.id = :userId")
	List<Servico> obterLista(Integer userId);
		
}
