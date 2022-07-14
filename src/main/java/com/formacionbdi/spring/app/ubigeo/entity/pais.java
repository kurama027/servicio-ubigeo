package com.formacionbdi.spring.app.ubigeo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax_pais")
public class pais {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PAIS")
	private long ID_PAIS; 
	@Column(name = "NO_PAIS")
	private String NO_PAIS;
	
	public long getID_PAIS() {
		return ID_PAIS;
	}
	public void setID_PAIS(long iD_PAIS) {
		ID_PAIS = iD_PAIS;
	}
	public String getNO_PAIS() {
		return NO_PAIS;
	}
	public void setNO_PAIS(String nO_PAIS) {
		NO_PAIS = nO_PAIS;
	}  
	
	
}
