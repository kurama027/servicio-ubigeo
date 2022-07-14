package com.formacionbdi.spring.app.ubigeo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.formacionbdi.spring.app.ubigeo.entity.provincia;
import com.formacionbdi.spring.app.ubigeo.repository.provRepository;
import com.formacionbdi.spring.app.ubigeo.service.provService;

@Service
public class provImpl implements provService{

	@Autowired
	private provRepository provir;
	
	@Override
	public List<provincia> findAll() {
		// TODO Auto-generated method stub
		return (List<provincia>)provir.findAll();
	}

	@Override
	public provincia findById(Long id) {
		// TODO Auto-generated method stub
		return provir.findById(id).orElse(null);
	}

	@Override
	public void delete(provincia provi) {
		// TODO Auto-generated method stub
		provir.delete(provi);
	}
	

}
