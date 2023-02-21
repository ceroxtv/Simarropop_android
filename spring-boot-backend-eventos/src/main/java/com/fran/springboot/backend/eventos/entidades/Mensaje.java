package com.fran.springboot.backend.eventos.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="simarropop_mensaje")
public class Mensaje implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	@Column
	private String name;
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name="usuario_receptor")
	private Usuario usuario_receptor;
	@Column
	private String contenido;
	
	public Mensaje(long id, String name, Usuario usuario, Usuario usuario_receptor, String contenido) {
		this.id = id;
		this.name = name;
		this.usuario = usuario;
		this.usuario_receptor = usuario_receptor;
		this.contenido = contenido;
	}
	
	public Mensaje() {
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario_receptor() {
		return usuario_receptor;
	}

	public void setUsuario_receptor(Usuario usuario_receptor) {
		this.usuario_receptor = usuario_receptor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
}
