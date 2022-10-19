package com.example.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EMPLOYEES database table.
 * 
 */
@Entity
@Table(name="EMPLOYEES")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMPLOYEE_ID")
	private Long id;
	

	@Column(name="FIRST_NAME")
	private String nombre;
	

	@Column(name="LAST_NAME")
	private String apellido;

	@Embedded
	private DatosPersonales datos;

	//bi-directional many-to-one association to Departmento
	@ManyToOne
	@JoinColumn(name="DEPARTMENT_ID")
	private Departamento departmento;

	@Column(name="MANAGER_ID")
	private Long jefeId;

	//bi-directional many-to-one association to Puesto
	@ManyToOne
	@JoinColumn(name="JOB_ID")
	private Puesto puesto;

	

	public Empleado() {
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public DatosPersonales getDatos() {
		return datos;
	}



	public void setDatos(DatosPersonales datos) {
		this.datos = datos;
	}



	public Departamento getDepartmento() {
		return departmento;
	}



	public void setDepartmento(Departamento departmento) {
		this.departmento = departmento;
	}



	public Long getJefeId() {
		return jefeId;
	}



	public void setJefeId(Long jefeId) {
		this.jefeId = jefeId;
	}



	public Puesto getPuesto() {
		return puesto;
	}



	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}



	
	

}