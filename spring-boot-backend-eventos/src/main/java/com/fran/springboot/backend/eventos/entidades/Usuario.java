package com.fran.springboot.backend.eventos.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="res_partner")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	@Column
	private String name;
	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<Articulo>articulos_publicados;
	@OneToMany(mappedBy="usuario_comprador", cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<Articulo>articulos_comprados;
	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<Mensaje>mensajes;
	@OneToMany(mappedBy="usuario_receptor", cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<Mensaje>mensajes_receptor;
	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<Valoracion>valoraciones;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento")
	private Date fecha;
	@Column(nullable=false)
	private String contrasenya;
	
	public Usuario() {
		
	}

	public Usuario(long id, String name, Set<Articulo> articulos_publicados, Set<Articulo> articulos_comprados,
			Set<Valoracion> valoraciones, Date fecha, String contrasenya) {
		super();
		this.id = id;
		this.name = name;
		this.articulos_publicados = articulos_publicados;
		this.articulos_comprados = articulos_comprados;
		this.valoraciones = valoraciones;
		this.fecha = fecha;
		this.contrasenya = contrasenya;
	}
	
	

	public Usuario(long id, String name, Set<Articulo> articulos_publicados, Set<Articulo> articulos_comprados,
			Set<Mensaje> mensajes, Set<Mensaje> mensajes_receptor, Set<Valoracion> valoraciones, Date fecha,
			String contrasenya) {
		this.id = id;
		this.name = name;
		this.articulos_publicados = articulos_publicados;
		this.articulos_comprados = articulos_comprados;
		this.mensajes = mensajes;
		this.mensajes_receptor = mensajes_receptor;
		this.valoraciones = valoraciones;
		this.fecha = fecha;
		this.contrasenya = contrasenya;
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

	public Set<Articulo> getArticulos_publicados() {
		return articulos_publicados;
	}

	public void setArticulos_publicados(Set<Articulo> articulos_publicados) {
		this.articulos_publicados = articulos_publicados;
	}

	public Set<Articulo> getArticulos_comprados() {
		return articulos_comprados;
	}

	public void setArticulos_comprados(Set<Articulo> articulos_comprados) {
		this.articulos_comprados = articulos_comprados;
	}

	public Set<Valoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Set<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public Set<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(Set<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public Set<Mensaje> getMensajes_receptor() {
		return mensajes_receptor;
	}

	public void setMensajes_receptor(Set<Mensaje> mensajes_receptor) {
		this.mensajes_receptor = mensajes_receptor;
	}
	
}
