package com.fran.springboot.backend.eventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Categoria;
import com.fran.springboot.backend.eventos.repositorios.ICategoria;

@Service
public class CategoriaServiceImp implements ICategoriaService {
	
	@Autowired
	private ICategoria repo;

	@Override
	public Categoria registrar(Categoria categoria) {
		return repo.save(categoria);
	}

	@Override
	public Categoria modificar(Categoria categoria) {
		return repo.save(categoria);
	}

	@Override
	public List<Categoria> listar() {
		return repo.findAll();
	}

	@Override
	public Categoria listarPorId(Long id) {
		Optional<Categoria> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Categoria();
	}

	@Override
	public void eliminar(Long id) {
		repo.deleteById(id);
	}

}
