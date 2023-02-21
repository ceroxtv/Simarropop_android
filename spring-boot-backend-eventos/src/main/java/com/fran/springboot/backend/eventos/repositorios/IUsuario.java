package com.fran.springboot.backend.eventos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fran.springboot.backend.eventos.entidades.Usuario;

public interface IUsuario extends JpaRepository<Usuario,Long> {
	
	@Query("FROM Usuario u WHERE u.email = :nombre AND u.contrasenya = :contrasenya")
	Usuario logUsuario(@Param("nombre")String nombre,@Param("contrasenya")String contrasenya);
	
	@Query("FROM Usuario u WHERE u.email=:email")
	Usuario checkEmail(@Param("email")String email);
	
	@Query("FROM Usuario u WHERE u.name=:name")
	Usuario checkName(@Param("name")String name);

}
