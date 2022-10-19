package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Puesto;

public interface PuestoRepository extends JpaRepository<Puesto, String> {

}
