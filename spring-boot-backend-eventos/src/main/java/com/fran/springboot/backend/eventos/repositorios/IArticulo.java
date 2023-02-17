package com.fran.springboot.backend.eventos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.fran.springboot.backend.eventos.entidades.Articulo;

@RepositoryRestResource(path="articulos",collectionResourceRel="articulos")
public interface IArticulo extends JpaRepository<Articulo,Long> {
	
	@Query("FROM Articulo s, Categoria c WHERE s.categoria = c.id AND c.name = :cat")
	List<Articulo> getArticulosCat(@Param("cat")String cat);
	
	@Query("FROM Articulo s, Usuario u where s.usuario = u.id and u.id = 53")
	List<Articulo> getArticulosUser(@Param("id")Long id);
	
	@Query("FROM Articulo s WHERE LOWER(s.name) LIKE LOWER(CONCAT(:name, '%'))")
	List<Articulo> getArticulosBuscador(@Param("name")String name);
}
