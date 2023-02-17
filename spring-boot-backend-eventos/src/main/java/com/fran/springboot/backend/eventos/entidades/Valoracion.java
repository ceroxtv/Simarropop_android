package com.fran.springboot.backend.eventos.entidades;
import javax.persistence.*;

@Entity
@Table(name="simarropop_valoracion")
public class Valoracion {
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
	@Column
	String opinion;
	@Column
	Float puntuacion;
	
	public Valoracion(long id, String name, Usuario usuario, String opinion, Float puntuacion) {
		this.id = id;
		this.name = name;
		this.usuario = usuario;
		this.opinion = opinion;
		this.puntuacion = puntuacion;
	}
	
	public Valoracion() {
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

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public Float getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Float puntuacion) {
		this.puntuacion = puntuacion;
	}
}
