package com.formacionbdi.spring.app.ubigeo.service;

import java.util.List;

import com.formacionbdi.spring.app.ubigeo.entity.pais;


public interface paisService {
	public List<pais> findAll();
	public pais findById(Long id);
	public void delete(pais pa);

}
