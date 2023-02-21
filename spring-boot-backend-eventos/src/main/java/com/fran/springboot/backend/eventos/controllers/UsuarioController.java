package com.fran.springboot.backend.eventos.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fran.springboot.backend.eventos.entidades.Usuario;
import com.fran.springboot.backend.eventos.services.IUsuarioService;

@RestController
@RequestMapping("/api/usuaris")
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@GetMapping
	public List<Usuario> listar(){
	return service.listar();
	}
	@GetMapping("/{id}")
	public Usuario listarPorId(@PathVariable Long id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Usuario registrar(@RequestBody Usuario usuario) {
	return service.registrar(usuario);
	}
	@PutMapping
	public Usuario modificar(@RequestBody Usuario usuario) {
	return service.modificar(usuario);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id){
	service.eliminar(id);
	}
	
	@GetMapping("/log/{nombre}/{contrasenya}")
	public Usuario logUsuario(
	@PathVariable(value = "nombre") String nombre,
	@PathVariable(value = "contrasenya") String contrasenya){
	return service.logUsuario(nombre, contrasenya);
	}
	
	@GetMapping("/check/{email}")
	public Usuario checkEmail(
	@PathVariable(value = "email")String email) {
		return service.checkEmail(email);
	}
	
	@GetMapping("/check2/{name}")
	public Usuario checkName(
	@PathVariable(value = "name")String name) {
		return service.checkName(name);
	}
	
	
}
