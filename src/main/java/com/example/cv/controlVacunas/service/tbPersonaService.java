package com.example.cv.controlVacunas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cv.controlVacunas.Model.tb_persona;
import com.example.cv.controlVacunas.interfaces.interface_tpersona;
import com.example.cv.controlVacunas.interfacesServices.tbPersona;
@Service
public class tbPersonaService implements tbPersona {

	@Autowired
	private interface_tpersona data;
	@Override
	public List<tb_persona> listar() {
		// TODO Auto-generated method stub
		return (List<tb_persona>)data.findAll() ;
	}

	@Override
	public Optional<tb_persona> listarId(String Id) {
		// TODO Auto-generated method stub
		return data.findById(Id);
	}

	@Override
	public String save(tb_persona c) {
		// TODO Auto-generated method stub
		String response = "";
		tb_persona cl = data.save(c);
		if(!cl.equals(null)) {
			response = "1";
		}
		return response;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		data.deleteById(id);

	}

}
