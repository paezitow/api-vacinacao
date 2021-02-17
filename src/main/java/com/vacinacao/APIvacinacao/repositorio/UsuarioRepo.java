package com.vacinacao.APIvacinacao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vacinacao.APIvacinacao.modelos.Usuarios;

public interface UsuarioRepo extends JpaRepository<Usuarios, Long> {
	
	Usuarios findById(int id);

}
