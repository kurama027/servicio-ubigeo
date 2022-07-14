package com.formacionbdi.spring.app.ubigeo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.ubigeo.entity.tipoPoblacion;
import com.formacionbdi.spring.app.ubigeo.repository.tipoPoblacionRepository;
import com.formacionbdi.spring.app.ubigeo.service.tipoPoblacionService;
@Service
public class tipoPoblacionImpl implements tipoPoblacionService{
	
	@Autowired
	private tipoPoblacionRepository tip;

	@Override
	public List<tipoPoblacion> findAll() {
		// TODO Auto-generated method stub
		return (List<tipoPoblacion>)tip.findAll();
	}

	@Override
	public tipoPoblacion findById(Long id) {
		// TODO Auto-generated method stub
		return tip.findById(id).orElse(null);
	}

	@Override
	public void delete(tipoPoblacion pob) {
		// TODO Auto-generated method stub
		tip.delete(pob);
	}

}
