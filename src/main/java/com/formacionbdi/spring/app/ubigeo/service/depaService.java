package com.formacionbdi.spring.app.ubigeo.service;

import java.util.List;

import com.formacionbdi.spring.app.ubigeo.entity.departamento;


public interface depaService {
	public List<departamento> findAll();
	public departamento findById(Long id);
	public void delete(departamento depa);

}
