package com.fran.springboot.backend.eventos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Foto;
import com.fran.springboot.backend.eventos.repositorios.IFoto;

@Service
public class FotoServiceImp implements IFotoService {

	@Autowired
	private IFoto repo;
	
	@Override
	public Foto registrar(Foto foto) {
		return repo.save(foto);
	}

	@Override
	public Foto modificar(Foto foto) {
		return repo.save(foto);
	}

	@Override
	public List<Foto> listar() {
		return repo.findAll();
	}

	@Override
	public Foto listarPorId(Long id) {
		Optional<Foto> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Foto();
	}

	@Override
	public void eliminar(Long id) {
		repo.deleteById(id);
	}

	

}
