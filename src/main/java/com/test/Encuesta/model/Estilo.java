package com.test.Encuesta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estilo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(unique = true, nullable = false)
	private String Nombre;

	public int getId() {
		return Id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
