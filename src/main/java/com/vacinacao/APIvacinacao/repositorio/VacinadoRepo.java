package com.vacinacao.APIvacinacao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vacinacao.APIvacinacao.repositorio.VacinadoRepo;

import com.vacinacao.APIvacinacao.modelos.Vacinados;

public interface VacinadoRepo extends JpaRepository<Vacinados, Long> {
	
	Vacinados findById(int id);

}
