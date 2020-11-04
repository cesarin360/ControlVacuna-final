package com.example.cv.controlVacunas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cv.controlVacunas.Model.tb_movimiento_dosis;
import com.example.cv.controlVacunas.interfaces.interface_tmovimientoDosis;
import com.example.cv.controlVacunas.interfacesServices.tbmDosis;

@Service
public class tbmDosisService implements tbmDosis {

	@Autowired
	private interface_tmovimientoDosis data;
	
	@Override
	public List<tb_movimiento_dosis> listar() {
		// TODO Auto-generated method stub
		return (List<tb_movimiento_dosis>)data.findAll();
	}

	@Override
	public Optional<tb_movimiento_dosis> listarId(long id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public String save(tb_movimiento_dosis c) {
		String response = "";
		tb_movimiento_dosis cl = data.save(c);
		if(!cl.equals(null)) {
			response = "1";
		}
		return response;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		data.deleteById(id);

	}
}
