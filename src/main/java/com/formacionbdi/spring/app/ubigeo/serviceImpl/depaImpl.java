package com.formacionbdi.spring.app.ubigeo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.ubigeo.entity.departamento;
import com.formacionbdi.spring.app.ubigeo.repository.depaRepository;
import com.formacionbdi.spring.app.ubigeo.service.depaService;


@Service
public class depaImpl implements depaService{
	@Autowired
	private depaRepository depar;

	@Override
	public List<departamento> findAll() {
		// TODO Auto-generated method stub
		return (List<departamento>)depar.findAll();
	}

	@Override
	public departamento findById(Long id) {
		// TODO Auto-generated method stub
		return depar.findById(id).orElse(null);
	}

	@Override
	public void delete(departamento depa) {
		// TODO Auto-generated method stub
		depar.delete(depa);
	}
	
	
}
