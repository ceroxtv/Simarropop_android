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
import com.fran.springboot.backend.eventos.entidades.Valoracion;
import com.fran.springboot.backend.eventos.services.IValoracionService;

@RestController
@RequestMapping("/api/valoracions")
public class ValoracionController {
	@Autowired
	private IValoracionService service;
	
	@GetMapping
	public List<Valoracion> listar(){
	return service.listar();
	}
	@GetMapping("/{id}")
	public Valoracion listarPorId(@PathVariable Long id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Valoracion registrar(@RequestBody Valoracion valoracion) {
	return service.registrar(valoracion);
	}
	@PutMapping
	public Valoracion modificar(@RequestBody  Valoracion valoracion) {
	return service.modificar(valoracion);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id){
	service.eliminar(id);
	}
}
