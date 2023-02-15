package com.fran.springboot.backend.eventos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fran.springboot.backend.eventos.entidades.Mensaje;
import com.fran.springboot.backend.eventos.repositorios.IMensaje;

@Service
public class MensajeServiceImp implements IMensajeService {

	@Autowired
	private IMensaje repo;
	
	@Override
	public Mensaje registrar(Mensaje mensaje) {
		return repo.save(mensaje);
	}

	@Override
	public Mensaje modificar(Mensaje mensaje) {
		return repo.save(mensaje);
	}

	@Override
	public List<Mensaje> listar() {
		return repo.findAll();
	}

	@Override
	public Mensaje listarPorId(Long id) {
		Optional<Mensaje> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Mensaje();
	}

	@Override
	public void eliminar(Long id) {
		repo.deleteById(id);
		
	}

}
