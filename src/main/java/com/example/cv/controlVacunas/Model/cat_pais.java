package com.example.cv.controlVacunas.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_pais")
public class cat_pais{
	@Id
	@Column(name = "id_pais")
	private Long id_pais;
	private String nombre_pais;

	public cat_pais() {
		// TODO Auto-generated constructor stub
	}

	public cat_pais(Long id_pais, String nombre_pais) {
		super();
		this.id_pais = id_pais;
		this.nombre_pais = nombre_pais;
	}

	public Long getId_pais() {
		return id_pais;
	}

	public void setId_pais(Long id_pais) {
		this.id_pais = id_pais;
	}

	public String getNombre_pais() {
		return nombre_pais;
	}

	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}

	@Override
	public String toString() {
		return "cat_pais [id_pais=" + id_pais + ", nombre_pais=" + nombre_pais + "]";
	}
	
}
