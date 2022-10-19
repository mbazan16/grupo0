package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
