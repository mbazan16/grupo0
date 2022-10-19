package com.example.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the JOBS database table.
 * 
 */
@Entity
@Table(name="JOBS")
public class Puesto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="JOB_ID")
	private String id;

	@Column(name="JOB_TITLE")
	private String nombre;

	@Column(name="MAX_SALARY")
	private Long maxSalario;

	@Column(name="MIN_SALARY")
	private Long minSalario;

	
	public Puesto() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getMaxSalario() {
		return this.maxSalario;
	}

	public void setMaxSalario(Long maxSalario) {
		this.maxSalario = maxSalario;
	}

	public Long getMinSalario() {
		return this.minSalario;
	}

	public void setMinSalario(Long minSalario) {
		this.minSalario = minSalario;
	}

	
}