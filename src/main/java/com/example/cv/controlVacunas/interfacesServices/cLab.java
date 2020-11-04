package com.example.cv.controlVacunas.interfacesServices;
import java.util.*;
import com.example.cv.controlVacunas.Model.cat_laboratorios;
public interface cLab { 
	public List<cat_laboratorios>listar();
	public Optional<cat_laboratorios>listarId(Integer id);
	public int save(cat_laboratorios c);
	public void delete(Integer id);

}
