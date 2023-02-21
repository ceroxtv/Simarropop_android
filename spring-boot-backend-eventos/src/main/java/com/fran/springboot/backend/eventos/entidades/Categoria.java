package com.fran.springboot.backend.eventos.entidades;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="simarropop_categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	@Column
	private String name;
	@Column
	private String descripcion_categoria;
	
	public Categoria(long id, String name, String descripcion) {
		this.id = id;
		this.name = name;
		this.descripcion_categoria = descripcion;
	}
	
	public Categoria() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return descripcion_categoria;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion_categoria = descripcion;
	}
	
	
}
