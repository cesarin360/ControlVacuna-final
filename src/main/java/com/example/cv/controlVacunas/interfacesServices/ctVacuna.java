package com.example.cv.controlVacunas.interfacesServices;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.example.cv.controlVacunas.Model.cat_tipo_vacuna;

public interface ctVacuna {
	public List<cat_tipo_vacuna>listars();
	@OneToOne(mappedBy = "cat_tipo_vacuna", cascade = CascadeType.ALL, orphanRemoval = true)
	public Optional<cat_tipo_vacuna>listarId(long id);
	public int save(cat_tipo_vacuna c);
	public void delete(long id);

}
