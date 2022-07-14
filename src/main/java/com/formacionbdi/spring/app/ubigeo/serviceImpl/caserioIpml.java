package com.formacionbdi.spring.app.ubigeo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.spring.app.ubigeo.entity.caserio;
import com.formacionbdi.spring.app.ubigeo.repository.caserioRepository;
import com.formacionbdi.spring.app.ubigeo.service.caserioService;
@Service
public class caserioIpml implements caserioService{
	@Autowired
	private caserioRepository casr;

	@Override
	public List<caserio> findAll() {
		// TODO Auto-generated method stub
		return (List<caserio>)casr.findAll();
	}

	@Override
	public caserio findById(Long id) {
		// TODO Auto-generated method stub
		return casr.findById(id).orElse(null);
	}

	@Override
	public void delete(caserio cas) {
		// TODO Auto-generated method stub
		casr.delete(cas);
	}

}
