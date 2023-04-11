package br.edu.infnet.appdent.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Atendimento;
import br.edu.infnet.appdent.model.domain.Servico;

@Repository
public interface AtendimentoRepository extends CrudRepository<Atendimento, Integer>{

		@Query("from Atendimento a where a.usuario.id = :userId")
		List<Atendimento> obterLista(Integer userId, Sort sort);
		
		
}
