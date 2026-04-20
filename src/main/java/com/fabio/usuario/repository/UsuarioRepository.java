package com.fabio.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
