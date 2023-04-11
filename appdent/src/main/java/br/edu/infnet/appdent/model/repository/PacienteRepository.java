package br.edu.infnet.appdent.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Atendimento;
import br.edu.infnet.appdent.model.domain.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
	
	@Query("from Paciente p where p.usuario.id = :userId")
	List<Paciente> obterLista(Integer userId, Sort sort);
	
	List<Paciente> findAllByOrderByNomeAsc();

}
