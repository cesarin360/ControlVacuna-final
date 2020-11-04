package com.example.cv.controlVacunas.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="tb_persona")
public class tb_persona {

	@NotEmpty(message ="No puede dejar este campo vacio")
	@Id
	@Column(name = "cui", unique = true, nullable = false)
	private String cui;
	@NotEmpty(message ="*No puede dejar este campo vacio")
	private String nombre;
	@NotEmpty(message ="*No puede dejar este campo vacio")
	private String fecha_nacimiento;
	@NotEmpty(message ="*No puede dejar este campo vacio")
	private String direccion;
	@NotEmpty(message ="*No puede dejar este campo vacio")
	private String telefono_movil;
	@NotEmpty(message ="*No puede dejar este campo vacio")
	private String telefono_casa;
	private String nombre_encargado;
	private String cui_encargado;
	
	public tb_persona() {
		// TODO Auto-generated constructor stub
	}

	public tb_persona(String cui, String nombre, String fecha_nacimiento, String direccion, String telefono_movil,
			String telefono_casa, String nombre_encargado, String cui_encargado) {
		super();
		this.cui = cui;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.telefono_movil = telefono_movil;
		this.telefono_casa = telefono_casa;
		this.nombre_encargado = nombre_encargado;
		this.cui_encargado = cui_encargado;
	}

	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono_movil() {
		return telefono_movil;
	}

	public void setTelefono_movil(String telefono_movil) {
		this.telefono_movil = telefono_movil;
	}

	public String getTelefono_casa() {
		return telefono_casa;
	}

	public void setTelefono_casa(String telefono_casa) {
		this.telefono_casa = telefono_casa;
	}

	public String getNombre_encargado() {
		return nombre_encargado;
	}

	public void setNombre_encargado(String nombre_encargado) {
		this.nombre_encargado = nombre_encargado;
	}

	public String getCui_encargado() {
		return cui_encargado;
	}

	public void setCui_encargado(String cui_encargado) {
		this.cui_encargado = cui_encargado;
	}
	
}
