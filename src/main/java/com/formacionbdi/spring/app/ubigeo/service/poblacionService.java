package com.formacionbdi.spring.app.ubigeo.service;

import java.util.List;

import com.formacionbdi.spring.app.ubigeo.entity.poblacion;


public interface poblacionService {
	public List<poblacion> findAll();
	public poblacion findById(Long id);
	public void delete(poblacion pob);

}
