package br.edu.infnet.appdent.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appdent.model.domain.Paciente;
import br.edu.infnet.appdent.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	@Query("from Usuario u where u.email = :email and u.senha = :senha")
	Usuario autenticacao(String email,  String senha);
	
	@Query("from Usuario")
	List<Usuario> obterLista(Sort sort);
	
}
