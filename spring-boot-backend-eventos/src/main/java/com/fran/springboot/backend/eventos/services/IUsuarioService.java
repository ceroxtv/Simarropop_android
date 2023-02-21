package com.fran.springboot.backend.eventos.services;

import java.util.List;
import com.fran.springboot.backend.eventos.entidades.Usuario;


public interface IUsuarioService {
	Usuario registrar(Usuario usuario);
	Usuario modificar(Usuario usuario);
	List<Usuario> listar();
	Usuario listarPorId(Long id);
	void eliminar(Long id);
	Usuario logUsuario(String nombre, String contrasenya);
	Usuario checkEmail(String email);
	Usuario checkName(String name);
}
