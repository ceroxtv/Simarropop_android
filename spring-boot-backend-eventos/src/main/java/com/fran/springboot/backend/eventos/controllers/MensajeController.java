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
import com.fran.springboot.backend.eventos.entidades.Mensaje;
import com.fran.springboot.backend.eventos.services.IMensajeService;

@RestController
@RequestMapping("/api/mensa")
public class MensajeController {

	@Autowired
	private IMensajeService service;
	
	@GetMapping
	public List<Mensaje> listar(){
	return service.listar();
	}
	@GetMapping("/{id}")
	public Mensaje listarPorId(@PathVariable Long id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Mensaje registrar(@RequestBody Mensaje mensaje) {
	return service.registrar(mensaje);
	}
	@PutMapping
	public Mensaje modificar(@RequestBody Mensaje mensaje) {
	return service.modificar(mensaje);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id){
	service.eliminar(id);
	}
}
