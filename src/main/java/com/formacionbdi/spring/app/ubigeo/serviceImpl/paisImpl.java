package com.formacionbdi.spring.app.ubigeo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.ubigeo.entity.pais;
import com.formacionbdi.spring.app.ubigeo.repository.paisRepository;
import com.formacionbdi.spring.app.ubigeo.service.paisService;
@Service
public class paisImpl implements paisService{

	@Autowired
	private paisRepository par;
	
	@Override
	public List<pais> findAll() {
		// TODO Auto-generated method stub
		return (List<pais>)par.findAll();
	}

	@Override
	public pais findById(Long id) {
		// TODO Auto-generated method stub
		return par.findById(id).orElse(null);
	}

	@Override
	public void delete(pais pa) {
		// TODO Auto-generated method stub
		par.delete(pa);
	}

}
