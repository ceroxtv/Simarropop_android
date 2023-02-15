package com.fran.springboot.backend.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fran.springboot.backend.eventos.entidades.Usuario;

public interface IUsuario extends JpaRepository<Usuario,Long> {
	
	@Query("FROM Usuario u WHERE u.email = :nombre AND u.contrasenya = :contrasenya")
	Usuario logUsuario(@Param("nombre")String nombre,@Param("contrasenya")String contrasenya);

}
