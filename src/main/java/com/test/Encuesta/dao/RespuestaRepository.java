package com.test.Encuesta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Encuesta.model.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {

	List<Respuesta> findAll();


}
