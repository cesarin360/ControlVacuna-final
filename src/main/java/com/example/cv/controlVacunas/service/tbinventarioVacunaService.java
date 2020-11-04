package com.example.cv.controlVacunas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cv.controlVacunas.Model.tb_inventario_vacunas;
import com.example.cv.controlVacunas.interfaces.interface_tbinventarioVacuna;
import com.example.cv.controlVacunas.interfacesServices.tbiVacuna;

@Service
public class tbinventarioVacunaService implements tbiVacuna {

	@Autowired
	private interface_tbinventarioVacuna data;
	@Override
	public List<tb_inventario_vacunas> listar() {
		// TODO Auto-generated method stub
		return (List<tb_inventario_vacunas>)data.findAll();
	}

	@Override
	public Optional<tb_inventario_vacunas> listarId(long id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int save(tb_inventario_vacunas c) {
		// TODO Auto-generated method stub
		int response = 0;
		tb_inventario_vacunas cl = data.save(c);
		if(!cl.equals(null)) {
			response = 1;
		}
		return response;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
		
	}

}
