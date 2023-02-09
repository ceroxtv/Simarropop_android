package com.fran.springboot.backend.eventos.services;

import java.util.List;
import com.fran.springboot.backend.eventos.entidades.Articulo;

public interface IArticuloService {
	Articulo registrar(Articulo articulo);
	Articulo modificar(Articulo articulo);
	List<Articulo> listar();
	Articulo listarPorId(Long id);
	void eliminar(Long id);
	List<Articulo>getArticulosCat(String cat);
}
