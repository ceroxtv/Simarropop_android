package com.fran.springboot.backend.eventos.services;

import java.util.List;
import com.fran.springboot.backend.eventos.entidades.Mensaje;

public interface IMensajeService {
	Mensaje registrar(Mensaje mensaje);
	Mensaje modificar(Mensaje mensaje);
	List<Mensaje> listar();
	Mensaje listarPorId(Long id);
	void eliminar(Long id);
}
