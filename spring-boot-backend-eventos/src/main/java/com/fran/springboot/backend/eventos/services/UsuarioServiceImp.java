package com.fran.springboot.backend.eventos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Usuario;
import com.fran.springboot.backend.eventos.repositorios.IUsuario;

@Service
public class UsuarioServiceImp implements IUsuarioService {
	
	@Autowired
	private IUsuario repo;

	@Override
	public Usuario registrar(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public Usuario modificar(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public List<Usuario> listar() {
		return repo.findAll();
	}

	@Override
	public Usuario listarPorId(Long id) {
		Optional<Usuario> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Usuario();
	}

	@Override
	public void eliminar(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Usuario logUsuario(String nombre, String contrasenya) {
		return repo.logUsuario(nombre, contrasenya);
	}
	
}
