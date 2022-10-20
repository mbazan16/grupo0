package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Pais;

public interface PaisRepository extends JpaRepository<Pais, String> {

}
