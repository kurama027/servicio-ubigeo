package com.formacionbdi.spring.app.ubigeo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.formacionbdi.spring.app.ubigeo.entity.distrito;
import com.formacionbdi.spring.app.ubigeo.repository.distRepository;
import com.formacionbdi.spring.app.ubigeo.service.distService;

@Service
public class distImpl implements distService{
	
	@Autowired
	private distRepository distr;

	@Override
	public List<distrito> findAll() {
		// TODO Auto-generated method stub
		return (List<distrito>)distr.findAll();
	}

	@Override
	public distrito findById(Long id) {
		// TODO Auto-generated method stub
		return distr.findById(id).orElse(null);
	}

	@Override
	public void delete(distrito dis) {
		// TODO Auto-generated method stub
		distr.delete(dis);
	}
	
}
