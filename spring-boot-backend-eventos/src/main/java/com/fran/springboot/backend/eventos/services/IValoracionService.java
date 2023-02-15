package com.fran.springboot.backend.eventos.services;

import java.util.List;
import com.fran.springboot.backend.eventos.entidades.Valoracion;

public interface IValoracionService {
	Valoracion registrar(Valoracion valoracion);
	Valoracion modificar(Valoracion valoracion);
	List<Valoracion> listar();
	Valoracion listarPorId(Long id);
	void eliminar(Long id);
}
