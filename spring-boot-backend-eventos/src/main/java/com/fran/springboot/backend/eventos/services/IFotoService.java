package com.fran.springboot.backend.eventos.services;

import java.util.List;
import com.fran.springboot.backend.eventos.entidades.Foto;

public interface IFotoService {
	Foto registrar(Foto foto);
	Foto modificar(Foto foto);
	List<Foto> listar();
	Foto listarPorId(Long id);
	void eliminar(Long id);
}
