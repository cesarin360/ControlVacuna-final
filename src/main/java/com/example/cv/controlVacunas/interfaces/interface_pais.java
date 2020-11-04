package com.example.cv.controlVacunas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cv.controlVacunas.Model.cat_pais;
@Repository
public interface interface_pais extends CrudRepository<cat_pais, Long> {

}
