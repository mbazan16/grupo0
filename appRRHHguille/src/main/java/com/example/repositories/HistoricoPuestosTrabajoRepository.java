package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Empleado;
import com.example.entities.HistorioPuestosTrabajo;
import com.example.entities.HistorioPuestosTrabajoPK;

public interface HistoricoPuestosTrabajoRepository extends JpaRepository<HistorioPuestosTrabajo, HistorioPuestosTrabajoPK> {

}
