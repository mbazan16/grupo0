package com.example.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the JOB_HISTORY database table.
 * 
 */
@Entity
@Table(name="JOB_HISTORY")
public class HistorioPuestosTrabajo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HistorioPuestosTrabajoPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date fechaFin;

	//bi-directional many-to-one association to Departmento
	@ManyToOne
	@JoinColumn(name="DEPARTMENT_ID")
	private Departamento departmento;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID", insertable=false, updatable=false)
	private Empleado empleado;

	//bi-directional many-to-one association to Puesto
	@ManyToOne
	@JoinColumn(name="JOB_ID")
	private Puesto puesto;

	public HistorioPuestosTrabajo() {
	}

	public HistorioPuestosTrabajoPK getId() {
		return this.id;
	}

	public void setId(HistorioPuestosTrabajoPK id) {
		this.id = id;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Departamento getDepartmento() {
		return departmento;
	}

	public void setDepartmento(Departamento departmento) {
		this.departmento = departmento;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	

}