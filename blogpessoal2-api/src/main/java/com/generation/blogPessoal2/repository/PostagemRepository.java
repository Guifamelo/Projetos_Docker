package com.generation.blogPessoal2.repository;

import java.util.List;

import com.generation.blogPessoal2.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	public List<Postagem> findAllByTextoContainingIgnoreCase (String texto);
}