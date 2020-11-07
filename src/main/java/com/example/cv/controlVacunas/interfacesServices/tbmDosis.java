package com.example.cv.controlVacunas.interfacesServices;

import java.util.List;
import java.util.Optional;

import com.example.cv.controlVacunas.Model.tb_movimiento_dosis;

public interface tbmDosis {

	public List<tb_movimiento_dosis>listar();
	public Optional<tb_movimiento_dosis>listarId(long id);
	public String save(tb_movimiento_dosis c);
	public void delete(long id);

}
