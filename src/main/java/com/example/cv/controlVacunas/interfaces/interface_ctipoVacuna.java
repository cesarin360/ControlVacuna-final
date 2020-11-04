package com.example.cv.controlVacunas.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cv.controlVacunas.Model.cat_tipo_vacuna;

@Repository
public interface interface_ctipoVacuna extends CrudRepository<cat_tipo_vacuna, Long> {

}
