package com.fran.springboot.backend.eventos.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="simarropop_foto")
public class Foto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	@Column
	private String name;
	@ManyToOne
	@JoinColumn(name="articulo")
	private Articulo articulo;
	@Column
	private String fotos_articulo_ruta;
	
	public Foto(long id, String name, Articulo articulo, String fotos_articulo_ruta) {
		this.id = id;
		this.name = name;
		this.articulo = articulo;
		this.fotos_articulo_ruta = fotos_articulo_ruta;
	}
	
	public Foto() {
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

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public String getFotos_articulo_ruta() {
		return fotos_articulo_ruta;
	}

	public void setFotos_articulo_ruta(String fotos_articulo_ruta) {
		this.fotos_articulo_ruta = fotos_articulo_ruta;
	}
	
	
	
	
}
