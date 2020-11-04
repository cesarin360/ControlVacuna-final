package com.example.cv.controlVacunas.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cat_tipo_vacuna")
public class cat_tipo_vacuna {
	@Id
	@Column(name = "idcat_tipo_Vacuna", unique = true, nullable = false)
	public long idcat_tipo_Vacuna;
	@NotNull(message="*No se puede dejar este campo vacio")
	public Integer cat_laboratorios_id_laboratorio;
	@NotNull(message="*No se puede dejar este campo vacio")
	public Integer cat_laboratorios_cat_pais_id_pais;
	@NotEmpty(message="*No se puede dejar este campo vacio")
	public String efectosAdversos;
	@NotEmpty(message="*No se puede dejar este campo vacio")
	public String modo_almacen;
	@NotNull(message="*No se puede dejar este campo vacio")
	public Integer numero_de_dosis;
	@NotEmpty(message="*No se puede dejar este campo vacio")
	public String nombre_vacuna;
	
	public cat_tipo_vacuna() {
		// TODO Auto-generated constructor stub
	}

	public cat_tipo_vacuna(long idcat_tipo_vacuna, Integer cat_laboratorios_id_laboratorio,
			Integer cat_laboratorios_cat_pais_id_pais, String efectosAdversos, String modo_almacen, Integer numero_de_dosis,
			String nombre_vacuna) {
		super();
		this.idcat_tipo_Vacuna = idcat_tipo_vacuna;
		this.cat_laboratorios_id_laboratorio = cat_laboratorios_id_laboratorio;
		this.cat_laboratorios_cat_pais_id_pais = cat_laboratorios_cat_pais_id_pais;
		this.efectosAdversos = efectosAdversos;
		this.modo_almacen = modo_almacen;
		this.numero_de_dosis = numero_de_dosis;
		this.nombre_vacuna = nombre_vacuna;
	}

	public long getIdcat_tipo_vacuna() {
		return idcat_tipo_Vacuna;
	}

	public void setIdcat_tipo_vacuna(long idcat_tipo_vacuna) {
		this.idcat_tipo_Vacuna = idcat_tipo_vacuna;
	}

	public Integer getCat_laboratorios_id_laboratorio() {
		return cat_laboratorios_id_laboratorio;
	}

	public void setCat_laboratorios_id_laboratorio(Integer cat_laboratorios_id_laboratorio) {
		this.cat_laboratorios_id_laboratorio = cat_laboratorios_id_laboratorio;
	}

	public Integer getCat_laboratorios_cat_pais_id_pais() {
		return cat_laboratorios_cat_pais_id_pais;
	}

	public void setCat_laboratorios_cat_pais_id_pais(Integer cat_laboratorios_cat_pais_id_pais) {
		this.cat_laboratorios_cat_pais_id_pais = cat_laboratorios_cat_pais_id_pais;
	}

	public String getEfectosAdversos() {
		return efectosAdversos;
	}

	public void setEfectosAdversos(String efectosAdversos) {
		this.efectosAdversos = efectosAdversos;
	}

	public String getModo_almacen() {
		return modo_almacen;
	}

	public void setModo_almacen(String modo_almacen) {
		this.modo_almacen = modo_almacen;
	}

	public Integer getNumero_de_dosis() {
		return numero_de_dosis;
	}

	public void setNumero_de_dosis(Integer numero_de_dosis) {
		this.numero_de_dosis = numero_de_dosis;
	}

	public String getNombre_vacuna() {
		return nombre_vacuna;
	}

	public void setNombre_vacuna(String nombre_vacuna) {
		this.nombre_vacuna = nombre_vacuna;
	}
	
	

}
