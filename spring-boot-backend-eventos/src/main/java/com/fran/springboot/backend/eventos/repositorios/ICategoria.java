package com.fran.springboot.backend.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fran.springboot.backend.eventos.entidades.Categoria;

public interface ICategoria extends JpaRepository<Categoria,Long> {

}
