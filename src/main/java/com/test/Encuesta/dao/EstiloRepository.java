package com.test.Encuesta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Encuesta.model.Estilo;

public interface EstiloRepository extends JpaRepository<Estilo, Integer> {
	List<Estilo> findAll();
}
