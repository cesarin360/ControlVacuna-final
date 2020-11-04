package com.example.cv.controlVacunas.Model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_inventario_vacunas1")
public class tb_inventario_vacunas {
	@Id  
	@Column(name = "id_inventario_vacuna" , unique = true, nullable = false)
	private long id_inventario_vacuna;
	@NotNull(message="*No se puede dejar este campo vacio")
	@Column(name = "fecha_compra")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha_compra;
	@NotNull(message="*No se puede dejar este campo vacio")
	@Column(name = "fecha_caducidad")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha_caducidad;
	@NotNull(message="*No se puede dejar este campo vacio")
	private BigDecimal precio_compra;
	@NotNull(message="*No se puede dejar este campo vacio")
	private Integer cantidad_adquirida;
	private int cat_tipo_Vacuna_idcat_tipo_Vacuna;
	private int cat_tipo_Vacuna_cat_laboratorios_id_laboratorio;
	private int cat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais;
	
	public tb_inventario_vacunas() {
		// TODO Auto-generated constructor stub
	}
	public tb_inventario_vacunas(long id_inventario_vacuna, Date fecha_compra, Date fecha_caducidad,
			BigDecimal precio_compra, Integer cantidad_adquirida, int cat_tipo_Vacuna_idcat_tipo_Vacuna,
			int cat_tipo_Vacuna_cat_laboratorios_id_laboratorio,
			int cat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais) {
		super();
		this.id_inventario_vacuna = id_inventario_vacuna;
		this.fecha_compra = fecha_compra;
		this.fecha_caducidad = fecha_caducidad;
		this.precio_compra = precio_compra;
		this.cantidad_adquirida = cantidad_adquirida;
		this.cat_tipo_Vacuna_idcat_tipo_Vacuna = cat_tipo_Vacuna_idcat_tipo_Vacuna;
		this.cat_tipo_Vacuna_cat_laboratorios_id_laboratorio = cat_tipo_Vacuna_cat_laboratorios_id_laboratorio;
		this.cat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais = cat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais;
	}

	public long getId_inventario_vacuna() {
		return id_inventario_vacuna;
	}

	public void setId_inventario_vacuna(long id_inventario_vacuna) {
		this.id_inventario_vacuna = id_inventario_vacuna;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public BigDecimal getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(BigDecimal precio_compra) {
		this.precio_compra = precio_compra;
	}

	public Integer getCantidad_adquirida() {
		return cantidad_adquirida;
	}

	public void setCantidad_adquirida(Integer cantidad_adquirida) {
		this.cantidad_adquirida = cantidad_adquirida;
	}

	public int getCat_tipo_Vacuna_idcat_tipo_Vacuna() {
		return cat_tipo_Vacuna_idcat_tipo_Vacuna;
	}

	public void setCat_tipo_Vacuna_idcat_tipo_Vacuna(int cat_tipo_Vacuna_idcat_tipo_Vacuna) {
		this.cat_tipo_Vacuna_idcat_tipo_Vacuna = cat_tipo_Vacuna_idcat_tipo_Vacuna;
	}

	public int getCat_tipo_Vacuna_cat_laboratorios_id_laboratorio() {
		return cat_tipo_Vacuna_cat_laboratorios_id_laboratorio;
	}

	public void setCat_tipo_Vacuna_cat_laboratorios_id_laboratorio(int cat_tipo_Vacuna_cat_laboratorios_id_laboratorio) {
		this.cat_tipo_Vacuna_cat_laboratorios_id_laboratorio = cat_tipo_Vacuna_cat_laboratorios_id_laboratorio;
	}

	public int getCat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais() {
		return cat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais;
	}

	public void setCat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais(
			int cat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais) {
		this.cat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais = cat_tipo_Vacuna_cat_laboratorios_cat_pais_id_pais;
	}
	
}
