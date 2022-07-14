package com.formacionbdi.spring.app.ubigeo.service;

import java.util.List;

import com.formacionbdi.spring.app.ubigeo.entity.distrito;


public interface distService {
	public List<distrito> findAll();
	public distrito findById(Long id);
	public void delete(distrito dis);

}
