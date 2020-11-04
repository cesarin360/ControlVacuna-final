package com.example.cv.controlVacunas.interfacesServices;

import java.util.List;
import java.util.Optional;
import com.example.cv.controlVacunas.Model.tb_persona;

public interface tbPersona {
	public List<tb_persona>listar();
	public Optional<tb_persona>listarId(String Id);
	public String save(tb_persona c);
	public void delete(String id);

}
