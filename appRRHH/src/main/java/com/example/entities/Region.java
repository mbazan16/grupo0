package com.example.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the REGIONS database table.
 * 
 */
@Entity
@Table(name="REGIONS")
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REGION_ID")
	private long id;

	@Column(name="REGION_NAME")
	private String nombre;

	
	public Region() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}