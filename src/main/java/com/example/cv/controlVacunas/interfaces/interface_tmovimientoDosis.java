package com.example.cv.controlVacunas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cv.controlVacunas.Model.tb_movimiento_dosis;

@Repository
public interface interface_tmovimientoDosis extends CrudRepository<tb_movimiento_dosis, Long> {

}
