package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class DatosPersonales implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name="PHONE_NUMBER")
	private String telefono;

	@Column(name="SALARY")
	private Long salario;
	
	@Temporal(TemporalType.DATE)
	@Column(name="HIRE_DATE")
	private Date fechaContratacion;
	
	@Column(name="COMMISSION_PCT")
	private Float commisionPct;

	private String email;

	public DatosPersonales() {
		super();
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Long getSalario() {
		return salario;
	}

	public void setSalario(Long salario) {
		this.salario = salario;
	}

	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public Float getCommisionPct() {
		return commisionPct;
	}

	public void setCommisionPct(Float commisionPct) {
		this.commisionPct = commisionPct;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "DatosPersonales [telefono=" + telefono + ", salario=" + salario + ", fechaContratacion="
				+ fechaContratacion + ", commisionPct=" + commisionPct + ", email=" + email + "]";
	}
	
	

}
