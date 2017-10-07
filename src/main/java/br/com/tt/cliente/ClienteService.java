package br.com.tt.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	List<Cliente> consulta() {

		//List<Cliente> resultado = repository.findByNomeLike("%4%");
		return repository.findAll();
	}

	public Cliente salvar(Cliente cliente) {
		return repository.save(cliente);

	}

	public Cliente buscar(Long id) {
		return repository.findOne(id);
	}

	public void excluir(Long id) {
		repository.delete(id);
		
	}
}
