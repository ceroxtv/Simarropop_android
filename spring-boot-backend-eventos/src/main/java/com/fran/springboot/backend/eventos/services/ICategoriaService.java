package com.fran.springboot.backend.eventos.services;

import java.util.List;

import com.fran.springboot.backend.eventos.entidades.Categoria;

public interface ICategoriaService {
	Categoria registrar(Categoria categoria);
	Categoria modificar(Categoria categoria);
	List<Categoria> listar();
	Categoria listarPorId(Long id);
	void eliminar(Long id);
}
