package com.example.cv.controlVacunas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cv.controlVacunas.Model.tb_persona;

@Repository
public interface interface_tpersona extends CrudRepository<tb_persona, String> {

}
