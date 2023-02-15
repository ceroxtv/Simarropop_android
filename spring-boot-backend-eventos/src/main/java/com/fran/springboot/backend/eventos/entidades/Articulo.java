package com.fran.springboot.backend.eventos.entidades;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="simarropop_articulo")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	@Column
	private String name;
	@ManyToOne
	@JoinColumn(name="categoria")
	private Categoria categoria;
	@Column
	private Float precio;
	@Column
	private String descripcion;
	@OneToMany(mappedBy="articulo", cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<Foto>fotos;
	@Column
	private String fotos_img_ruta;
	@Column
	private String ubicacion;
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name="usuario_comprador")
	private Usuario usuario_comprador;
	public Articulo(long id, String name, Categoria categoria, Float precio, String descripcion, Set<Foto> fotos,
			String fotos_img_ruta, String ubicacion, Usuario usuario, Usuario usuario_comprador) {
		this.id = id;
		this.name = name;
		this.categoria = categoria;
		this.precio = precio;
		this.descripcion = descripcion;
		this.fotos = fotos;
		this.fotos_img_ruta = fotos_img_ruta;
		this.ubicacion = ubicacion;
		this.usuario = usuario;
		this.usuario_comprador = usuario_comprador;
	}
	
	public Articulo() {
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(Set<Foto> fotos) {
		this.fotos = fotos;
	}

	public String getFotos_img_ruta() {
		return fotos_img_ruta;
	}

	public void setFotos_img_ruta(String fotos_img_ruta) {
		this.fotos_img_ruta = fotos_img_ruta;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario_comprador() {
		return usuario_comprador;
	}

	public void setUsuario_comprador(Usuario usuario_comprador) {
		this.usuario_comprador = usuario_comprador;
	}	
}
