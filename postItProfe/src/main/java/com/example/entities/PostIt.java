package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="POSTIT")
public class PostIt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String color;
	private Integer tamanio;
	
	public PostIt() {
		super();
	}	
	

	public PostIt(String color, Integer tamanio) {
		super();
		this.color = color;
		this.tamanio = tamanio;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getTamanio() {
		return tamanio;
	}

	public void setTamanio(Integer tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "PostIt [id=" + id + ", color=" + color + ", tamanio=" + tamanio + "]";
	}
	
	
	
	

}
