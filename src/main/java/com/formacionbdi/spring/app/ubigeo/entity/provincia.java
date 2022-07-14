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
@Table(name = "tax_provincia")
public class provincia { 
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROVINCIA")
	private long ID_PROVINCIA; 
	@Column(name = "NO_PROVINCIA")
	private String NO_PROVINCIA;
	@ManyToOne()
	@JoinColumn(name="ID_PRO_DEPA")
	private departamento depa;
	public long getID_PROVINCIA() {
		return ID_PROVINCIA;
	}
	public void setID_PROVINCIA(long iD_PROVINCIA) {
		ID_PROVINCIA = iD_PROVINCIA;
	}
	public String getNO_PROVINCIA() {
		return NO_PROVINCIA;
	}
	public void setNO_PROVINCIA(String nO_PROVINCIA) {
		NO_PROVINCIA = nO_PROVINCIA;
	}
	public departamento getDepa() {
		return depa;
	}
	public void setDepa(departamento depa) {
		this.depa = depa;
	}
	

}
