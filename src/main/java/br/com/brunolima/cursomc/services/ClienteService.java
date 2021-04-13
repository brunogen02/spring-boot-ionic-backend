package br.com.brunolima.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brunolima.cursomc.domain.Cliente;
import br.com.brunolima.cursomc.repositories.ClienteRepository;
import br.com.brunolima.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		
//		Optional<Cliente> obj = repo.findById(id);
//		return obj.orElse(null);
	}

}
