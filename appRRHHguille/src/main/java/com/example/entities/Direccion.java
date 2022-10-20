package com.example.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the LOCATIONS database table.
 * 
 */
@Entity
@Table(name="LOCATIONS")
public class Direccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOCATION_ID")
	private Long id;

	@Column(name="CITY")
	private String ciudad;

	@Column(name="POSTAL_CODE")
	private String codigoPostal;

	@Column(name="STATE_PROVINCE")
	private String provincia;

	@Column(name="STREET_ADDRESS")
	private String calle;

	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="COUNTRY_ID")
	private Pais pais;

	public Direccion() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", provincia="
				+ provincia + ", calle=" + calle + ", pais=" + pais + "]";
	}

	
}