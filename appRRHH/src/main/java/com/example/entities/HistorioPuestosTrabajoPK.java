package com.example.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

/**
 * The primary key class for the JOB_HISTORY database table.
 * 
 */
@Embeddable
public class HistorioPuestosTrabajoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EMPLOYEE_ID", insertable=false, updatable=false)
	private long empleadoId;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private java.util.Date fechaComienzo;

	public HistorioPuestosTrabajoPK() {
	}

	public long getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(long empleadoId) {
		this.empleadoId = empleadoId;
	}

	public java.util.Date getFechaComienzo() {
		return fechaComienzo;
	}

	public void setFechaComienzo(java.util.Date fechaComienzo) {
		this.fechaComienzo = fechaComienzo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empleadoId, fechaComienzo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistorioPuestosTrabajoPK other = (HistorioPuestosTrabajoPK) obj;
		return empleadoId == other.empleadoId && Objects.equals(fechaComienzo, other.fechaComienzo);
	}
	
}