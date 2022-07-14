package com.formacionbdi.spring.app.ubigeo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tax_departamento")
public class departamento {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DEPARTAMENTO")
	private long ID_DEPARTAMENTO; 
	@Column(name = "NO_DEPARTAMENTO")
	private String NO_DEPARTAMENTO;
	@ManyToOne()
	@JoinColumn(name="ID_DEPAR_PAIS")
	private pais pa;
	public long getID_DEPARTAMENTO() {
		return ID_DEPARTAMENTO;
	}
	public void setID_DEPARTAMENTO(long iD_DEPARTAMENTO) {
		ID_DEPARTAMENTO = iD_DEPARTAMENTO;
	}
	public String getNO_DEPARTAMENTO() {
		return NO_DEPARTAMENTO;
	}
	public void setNO_DEPARTAMENTO(String nO_DEPARTAMENTO) {
		NO_DEPARTAMENTO = nO_DEPARTAMENTO;
	}
	public pais getPa() {
		return pa;
	}
	public void setPa(pais pa) {
		this.pa = pa;
	} 
	
}
