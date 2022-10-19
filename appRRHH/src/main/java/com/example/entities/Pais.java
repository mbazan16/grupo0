package com.example.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the COUNTRIES database table.
 * 
 */
@Entity
@Table(name="COUNTRIES")
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COUNTRY_ID")
	private String id;

	@Column(name="COUNTRY_NAME")
	private String nombre;

	//bi-directional many-to-one association to Region
	@ManyToOne
	@JoinColumn(name="REGION_ID")
	private Region region;

	

	public Pais() {
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

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	

}