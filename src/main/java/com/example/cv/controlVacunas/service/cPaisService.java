package com.example.cv.controlVacunas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cv.controlVacunas.Model.cat_pais;
import com.example.cv.controlVacunas.interfaces.interface_pais;
import com.example.cv.controlVacunas.interfacesServices.cPais;

@Service
public class cPaisService implements cPais{

	@Autowired
	private interface_pais c;
	@Override
	public List<cat_pais> listaPaises() {
		
		return (List<cat_pais>) c.findAll();
	}

}
