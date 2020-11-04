package com.example.cv.controlVacunas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.cv.controlVacunas.Model.cat_laboratorios;

@Repository
public interface interface_cLaboratorios extends CrudRepository<cat_laboratorios, Integer>{
    
}
