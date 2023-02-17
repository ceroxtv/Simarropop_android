package com.fran.springboot.backend.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fran.springboot.backend.eventos.entidades.Valoracion;

@RepositoryRestResource(path="valoraciones",collectionResourceRel="valoraciones")
public interface IValoracion extends JpaRepository<Valoracion,Long> {

}
