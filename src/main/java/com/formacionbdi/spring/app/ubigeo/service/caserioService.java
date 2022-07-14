package com.formacionbdi.spring.app.ubigeo.service;

import java.util.List;

import com.formacionbdi.spring.app.ubigeo.entity.caserio;


public interface caserioService {
	public List<caserio> findAll();
	public caserio findById(Long id);
	public void delete(caserio cas);
}
