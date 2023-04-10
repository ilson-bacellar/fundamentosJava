package br.edu.infnet.appdent.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appdent.model.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface IEnderecoClient {
	
	@GetMapping(value = "/{cep}/json")
	public Endereco buscaPorCep(@PathVariable String cep);
}
