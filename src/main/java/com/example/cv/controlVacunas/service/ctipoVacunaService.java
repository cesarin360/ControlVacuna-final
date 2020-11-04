package com.example.cv.controlVacunas.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cv.controlVacunas.Model.cat_tipo_vacuna;
import com.example.cv.controlVacunas.interfaces.interface_ctipoVacuna;
import com.example.cv.controlVacunas.interfacesServices.ctVacuna;

@Service
public class ctipoVacunaService implements ctVacuna {
	@Autowired
	private interface_ctipoVacuna data;
	
	@Override
	public List<cat_tipo_vacuna> listars() {
		// TODO Auto-generated method stub
		return (List<cat_tipo_vacuna>)data.findAll();
	}

	@Override
	public Optional<cat_tipo_vacuna> listarId(long id) {
		return data.findById(id);
	}

	@Override
	public int save(cat_tipo_vacuna c) {
		int response = 0;
		cat_tipo_vacuna cl = data.save(c);
                if(!cl.equals(null)){
                    response = 1;
                }
		return response;
	}

	@Override
	public void delete(long id) {
	     data.deleteById(id);
		
	}

}
