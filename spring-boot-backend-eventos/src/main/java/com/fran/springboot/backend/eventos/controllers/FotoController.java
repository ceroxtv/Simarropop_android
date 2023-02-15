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
import com.fran.springboot.backend.eventos.entidades.Foto;
import com.fran.springboot.backend.eventos.services.IFotoService;

@RestController
@RequestMapping("/api/fotografias")
public class FotoController {
	
	@Autowired
	private IFotoService service;
	
	@GetMapping
	public List<Foto> listar(){
	return service.listar();
	}
	@GetMapping("/{id}")
	public Foto listarPorId(@PathVariable Long id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Foto registrar(@RequestBody Foto foto) {
	return service.registrar(foto);
	}
	@PutMapping
	public Foto modificar(@RequestBody Foto foto) {
	return service.modificar(foto);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id){
	service.eliminar(id);
	}
}
