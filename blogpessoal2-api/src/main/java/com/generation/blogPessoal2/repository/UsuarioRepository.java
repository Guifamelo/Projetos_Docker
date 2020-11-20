package com.generation.blogPessoal2.repository;

import java.util.Optional;

import com.generation.blogPessoal2.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}
