package com.test.Encuesta.model;


import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Respuesta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(unique = true, nullable = false)
	private String Email;

	@ManyToOne
	private Estilo estilos;

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the estilos
	 */
	public Estilo getEstilos() {
		return estilos;
	}

	/**
	 * @param estilos the estilos to set
	 */
	public void setEstilo(Estilo estilo) {
		estilos = estilo;
	}
}
