package com.formacionbdi.spring.app.ubigeo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.ubigeo.entity.poblacion;
import com.formacionbdi.spring.app.ubigeo.repository.poblacionRepository;
import com.formacionbdi.spring.app.ubigeo.service.poblacionService;
@Service
public class poblacionImpl implements poblacionService{
	@Autowired
	private poblacionRepository pobr;

	@Override
	public List<poblacion> findAll() {
		// TODO Auto-generated method stub
		return (List<poblacion>)pobr.findAll();
	}

	@Override
	public poblacion findById(Long id) {
		// TODO Auto-generated method stub
		return pobr.findById(id).orElse(null);
	}

	@Override
	public void delete(poblacion pob) {
		// TODO Auto-generated method stub
		pobr.delete(pob);
	}

}
