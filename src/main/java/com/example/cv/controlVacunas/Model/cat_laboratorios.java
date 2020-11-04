package com.example.cv.controlVacunas.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "cat_laboratorios")
public class cat_laboratorios{
	@Id  
    @Column(name = "id_laboratorio" , unique = true, nullable = false) 
	@NotNull(message="*No se puede dejar este campo vacio")
	private Integer id_laboratorio;
	@Column(name="Nombre_laboratorio")
	@NotEmpty(message="*No se puede dejar este campo vacio")
	private String Nombre_laboratorio;
	@NotNull(message="*No se puede dejar este campo vacio")
	private Integer cat_pais_id_pais;
	public cat_laboratorios() {
		// TODO Auto-generated constructor stub
	}
	public cat_laboratorios(Integer id_laboratorio, String nombre_laboratorio, Integer cat_pais_id_pais) {
		super();
		this.id_laboratorio = id_laboratorio;
		this.Nombre_laboratorio = nombre_laboratorio;
		this.cat_pais_id_pais =cat_pais_id_pais;
	}
        
	public Integer getId_laboratorio() {
		return id_laboratorio;
	}
	
	public void setId_laboratorio(Integer id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public String getNombre_laboratorio() {
		return Nombre_laboratorio;
	}
	public void setNombre_laboratorio(String nombre_laboratorio) {
		Nombre_laboratorio = nombre_laboratorio;
	}
	
	public Integer getId_pais() {
		return cat_pais_id_pais;
	}
	public void setId_pais(Integer cat_pais_id_pais) {
		this.cat_pais_id_pais = cat_pais_id_pais;
	}	
}
