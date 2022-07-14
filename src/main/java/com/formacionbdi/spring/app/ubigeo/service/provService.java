package com.formacionbdi.spring.app.ubigeo.service;

import java.util.List;

import com.formacionbdi.spring.app.ubigeo.entity.provincia;


public interface provService {
	public List<provincia> findAll();
	public provincia findById(Long id);
	public void delete(provincia provi);
}
