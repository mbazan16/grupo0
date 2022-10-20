package com.example.dto;

public class EmpleadoDTO {

	private Long id;// Sí
	private String nombre;// Sí
	private String idPuesto;// Sí
	private String puesto;// Sí

	private Long idJefe;// Sí
	private String jefe;// No

	private Long idDepartamento;// Sí
	private String departamento;// Sí

	private Long idJefeDepartamento;// Sí
	private String jefeDepartamento;// No

	public EmpleadoDTO() {
		super();
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

	
	public String getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(String idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Long getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(Long idJefe) {
		this.idJefe = idJefe;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	public Long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Long getIdJefeDepartamento() {
		return idJefeDepartamento;
	}

	public void setIdJefeDepartamento(Long idJefeDepartamento) {
		this.idJefeDepartamento = idJefeDepartamento;
	}

	public String getJefeDepartamento() {
		return jefeDepartamento;
	}

	public void setJefeDepartamento(String jefeDepartamento) {
		this.jefeDepartamento = jefeDepartamento;
	}

}
