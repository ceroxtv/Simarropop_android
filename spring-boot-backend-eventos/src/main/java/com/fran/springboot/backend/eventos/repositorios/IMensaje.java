package com.fran.springboot.backend.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fran.springboot.backend.eventos.entidades.Mensaje;

public interface IMensaje extends JpaRepository<Mensaje,Long> {

}
