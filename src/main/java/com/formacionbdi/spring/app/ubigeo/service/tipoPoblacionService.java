package com.formacionbdi.spring.app.ubigeo.service;

import java.util.List;

import com.formacionbdi.spring.app.ubigeo.entity.tipoPoblacion;


public interface tipoPoblacionService {
	public List<tipoPoblacion> findAll();
	public tipoPoblacion findById(Long id);
	public void delete(tipoPoblacion pob);

}
