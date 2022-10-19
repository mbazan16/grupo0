package com.example.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DEPARTMENTS database table.
 * 
 */
@Entity
@Table(name="DEPARTMENTS")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DEPARTMENT_ID")
	private Long id;

	@Column(name="DEPARTMENT_NAME")
	private String nombre;

	
	@Column(name="MANAGER_ID")
	private Long jefeDepartamentoId;

	//bi-directional many-to-one association to Direccion
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private Direccion location;

	

	public Departamento() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getJefeDepartamentoId() {
		return jefeDepartamentoId;
	}

	public void setJefeDepartamentoId(Long jefeDepartamentoId) {
		this.jefeDepartamentoId = jefeDepartamentoId;
	}

	public Direccion getLocation() {
		return location;
	}

	public void setLocation(Direccion location) {
		this.location = location;
	}

	

}