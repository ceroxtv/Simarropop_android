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

import com.fran.springboot.backend.eventos.entidades.Categoria;
import com.fran.springboot.backend.eventos.services.ICategoriaService;

@RestController
@RequestMapping("/api/catego")
public class CategoriaController {
	@Autowired
	private ICategoriaService service;
	
	@GetMapping
	public List<Categoria> listar(){
	return service.listar();
	}
	@GetMapping("/{id}")
	public Categoria listarPorId(@PathVariable Long id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Categoria registrar(@RequestBody Categoria categoria) {
	return service.registrar(categoria);
	}
	@PutMapping
	public Categoria modificar(@RequestBody Categoria categoria) {
	return service.modificar(categoria);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id){
	service.eliminar(id);
	}
}
