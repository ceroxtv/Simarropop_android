package com.fran.springboot.backend.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fran.springboot.backend.eventos.entidades.Foto;

@RepositoryRestResource(path="fotos",collectionResourceRel="fotos")
public interface IFoto extends JpaRepository<Foto,Long> {

}
