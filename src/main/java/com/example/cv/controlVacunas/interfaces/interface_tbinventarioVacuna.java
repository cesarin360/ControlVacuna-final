package com.example.cv.controlVacunas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cv.controlVacunas.Model.tb_inventario_vacunas;

@Repository
public interface interface_tbinventarioVacuna extends CrudRepository<tb_inventario_vacunas, Long> {

}
