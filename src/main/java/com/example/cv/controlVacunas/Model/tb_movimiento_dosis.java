package com.example.cv.controlVacunas.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_movimiento_dosis")
public class tb_movimiento_dosis {

	@Id
	@Column(name = "idtb_movimiento_dosis", unique = true, nullable = false)
	private long idtb_movimiento_dosis;
	@NotNull(message="*No se puede dejar este campo vacio")
	@Column(name = "fecha_movimiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha_movimiento;
	@NotNull(message="*No se puede dejar este campo vacio")
	private Integer cantidad_aplicada;
	@NotEmpty(message ="*No puede dejar este campo vacio")
	private String tb_persona_CUI;
	@NotNull(message="*No se puede dejar este campo vacio")
	private Integer tb_inventario_vacunas_id_inventario_vacuna;
	private int tb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna;
	private int tb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab;
	@Column(name ="tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais")
	private int tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais;

	public tb_movimiento_dosis() {
		// TODO Auto-generated constructor stub
	}

	public tb_movimiento_dosis(long idtb_movimiento_dosis, Date fecha_movimiento, Integer cantidad_aplicada,
			String tb_persona_CUI, Integer tb_inventario_vacunas_id_inventario_vacuna,
			int tb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna,
			int tb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab,
			int tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais) {
		super();
		this.idtb_movimiento_dosis = idtb_movimiento_dosis;
		this.fecha_movimiento = fecha_movimiento;
		this.cantidad_aplicada = cantidad_aplicada;
		this.tb_persona_CUI = tb_persona_CUI;
		this.tb_inventario_vacunas_id_inventario_vacuna = tb_inventario_vacunas_id_inventario_vacuna;
		this.tb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna = tb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna;
		this.tb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab = tb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab;
		this.tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais = tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais;
	}

	public long getIdtb_movimiento_dosis() {
		return idtb_movimiento_dosis;
	}

	public void setIdtb_movimiento_dosis(long idtb_movimiento_dosis) {
		this.idtb_movimiento_dosis = idtb_movimiento_dosis;
	}

	public Date getFecha_movimiento() {
		return fecha_movimiento;
	}

	public void setFecha_movimiento(Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}

	public Integer getCantidad_aplicada() {
		return cantidad_aplicada;
	}

	public void setCantidad_aplicada(Integer cantidad_aplicada) {
		this.cantidad_aplicada = cantidad_aplicada;
	}

	public String getTb_persona_CUI() {
		return tb_persona_CUI;
	}

	public void setTb_persona_CUI(String tb_persona_CUI) {
		this.tb_persona_CUI = tb_persona_CUI;
	}

	public Integer getTb_inventario_vacunas_id_inventario_vacuna() {
		return tb_inventario_vacunas_id_inventario_vacuna;
	}

	public void setTb_inventario_vacunas_id_inventario_vacuna(Integer tb_inventario_vacunas_id_inventario_vacuna) {
		this.tb_inventario_vacunas_id_inventario_vacuna = tb_inventario_vacunas_id_inventario_vacuna;
	}

	public int getTb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna() {
		return tb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna;
	}

	public void setTb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna(
			int tb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna) {
		this.tb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna = tb_inventario_vacunas_cat_tipo_Vacuna_idcat_tipo_Vacuna;
	}

	public int getTb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab() {
		return tb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab;
	}

	public void setTb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab(
			int tb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab) {
		this.tb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab = tb_inventario_vacunas_cat_tipo_Vacuna_cat_lab_id_lab;
	}

	public int getTb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais() {
		return tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais;
	}

	public void setTb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais(
			int tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais) {
		this.tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais = tb_invent_vacunas_cat_tipo_Vacuna_cat_lab_cat_pais_id_pais;
	}

}
