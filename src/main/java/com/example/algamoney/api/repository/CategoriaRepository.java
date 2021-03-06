package com.example.algamoney.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
		
	List<Categoria> findByNome(String nome);
	List<Categoria> findByNomeContaining(String nome);
	
}
