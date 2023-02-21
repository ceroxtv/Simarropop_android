package com.fran.springboot.backend.eventos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Articulo;
import com.fran.springboot.backend.eventos.repositorios.IArticulo;

@Service
public class ArticuloServiceImp implements IArticuloService {

	@Autowired
	private IArticulo repo;
	
	@Override
	public Articulo registrar(Articulo articulo) {
		return repo.save(articulo);
	}

	@Override
	public Articulo modificar(Articulo articulo) {
		return repo.save(articulo);
	}

	@Override
	public List<Articulo> listar() {
		return repo.findAll();
	}

	@Override
	public Articulo listarPorId(Long id) {
		Optional<Articulo> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Articulo();
	}

	@Override
	public void eliminar(Long id) {
		repo.deleteById(id);
	}

	@Override
	public List<Articulo> getArticulosCat(String cat) {
		return repo.getArticulosCat(cat);
	}

	@Override
	public List<Articulo> getArticulosUser(Long id) {
		return repo.getArticulosUser(id);
	}

	@Override
	public List<Articulo> getArticulosBuscador(String name) {
		return repo.getArticulosBuscador(name);
	}

	@Override
	public List<Articulo> getArticulosNoUser(Long id) {
		return repo.getArticulosNoUser(id);
	}

	@Override
	public List<Articulo> getArticulosCatNouser(String cat, Long id) {
		return repo.getArticulosCatNouser(cat, id);
	}

}
