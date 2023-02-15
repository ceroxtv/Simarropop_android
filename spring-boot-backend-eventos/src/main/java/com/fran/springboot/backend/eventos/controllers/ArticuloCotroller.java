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
import com.fran.springboot.backend.eventos.entidades.Articulo;
import com.fran.springboot.backend.eventos.services.IArticuloService;

@RestController
@RequestMapping("/api/articuls")
public class ArticuloCotroller {
	
	@Autowired
	private IArticuloService service;
	
	@GetMapping
	public List<Articulo> listar(){
	return service.listar();
	}
	@GetMapping("/{id}")
	public Articulo listarPorId(@PathVariable Long id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Articulo registrar(@RequestBody Articulo articulo) {
	return service.registrar(articulo);
	}
	@PutMapping
	public Articulo modificar(@RequestBody Articulo articulo) {
	return service.modificar(articulo);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id){
	service.eliminar(id);
	}
	@GetMapping("/cat/{cat}")
	public List<Articulo> getArticulosCat(
	@PathVariable(value = "cat") String cat){
	return service.getArticulosCat(cat);
	}
	@GetMapping("/user/{id}")
	public List<Articulo> getArticulosUser(
	@PathVariable(value = "id") Long id){
	return service.getArticulosUser(id);
	}
	@GetMapping("/buscador/{name}")
	public List<Articulo> getArticulosBuscador(
	@PathVariable(value = "name") String name){
	return service.getArticulosBuscador(name);
	}
}
