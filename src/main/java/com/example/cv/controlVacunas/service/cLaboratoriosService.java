package com.example.cv.controlVacunas.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cv.controlVacunas.interfacesServices.cLab;
import com.example.cv.controlVacunas.Model.cat_laboratorios;
import com.example.cv.controlVacunas.interfaces.interface_cLaboratorios;
@Service
public class cLaboratoriosService implements cLab {

	@Autowired
	private interface_cLaboratorios data;
	
	@Override
	public List<cat_laboratorios> listar() {
		// TODO Auto-generated method stub
		return (List<cat_laboratorios>)data.findAll();
	}
	@Override
	public Optional<cat_laboratorios> listarId(Integer id) {
		return data.findById(id);
	}

	@Override
	public int save(cat_laboratorios c) {
		int response = 0;
                cat_laboratorios cl = data.save(c);
                if(!cl.equals(null)){
                    response = 1;
                }
		return response;
	}

	@Override
	public void delete(Integer id) {
	     data.deleteById(id);
		
	}

}
