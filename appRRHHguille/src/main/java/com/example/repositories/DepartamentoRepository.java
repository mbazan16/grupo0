package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
