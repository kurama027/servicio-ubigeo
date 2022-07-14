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
@Table(name = "tax_distrito")
public class distrito {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TAX_DISTRITO")
	private long ID_TAX_DISTRITO; 
	@Column(name = "NO_DISTRITO")
	private String NO_DISTRITO;
	@ManyToOne()
	@JoinColumn(name="ID_DIS_PRO")
	private provincia prov;
	public long getID_TAX_DISTRITO() {
		return ID_TAX_DISTRITO;
	}
	public void setID_TAX_DISTRITO(long iD_TAX_DISTRITO) {
		ID_TAX_DISTRITO = iD_TAX_DISTRITO;
	}
	public String getNO_DISTRITO() {
		return NO_DISTRITO;
	}
	public void setNO_DISTRITO(String nO_DISTRITO) {
		NO_DISTRITO = nO_DISTRITO;
	}
	public provincia getProv() {
		return prov;
	}
	public void setProv(provincia prov) {
		this.prov = prov;
	} 
	

}
