package com.generation.FarmaciaGeneration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmaciaGeneration.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByDepartamentoContainingIgnoreCase (String departamento);

}
