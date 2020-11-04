package com.example.cv.controlVacunas.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.example.cv.controlVacunas.Model.tb_inventario_vacunas;

public interface tbiVacuna {
	public List<tb_inventario_vacunas>listar();
	public Optional<tb_inventario_vacunas>listarId(long id);
	public int save(tb_inventario_vacunas c);
	public void delete(long id);

}
