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
@Table(name = "tax_ubigeo")
public class ubigeo {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_UBIGEO")
	private long ID_UBIGEO; 
	@Column(name = "NU_UBIGEO")
	private String NU_UBIGEO;
	@Column(name = "ID_PERSONA")
	private long ID_PERSONA; 
	@ManyToOne()
	@JoinColumn(name="ID_UBI_PAIS")
	private pais pa;
	
	public long getID_UBIGEO() {
		return ID_UBIGEO;
	}
	public void setID_UBIGEO(long iD_UBIGEO) {
		ID_UBIGEO = iD_UBIGEO;
	}
	public String getNU_UBIGEO() {
		return NU_UBIGEO;
	}
	public void setNU_UBIGEO(String nU_UBIGEO) {
		NU_UBIGEO = nU_UBIGEO;
	}
	public long getID_PERSONA() {
		return ID_PERSONA;
	}
	public void setID_PERSONA(long iD_PERSONA) {
		ID_PERSONA = iD_PERSONA;
	}
	public pais getPa() {
		return pa;
	}
	public void setPa(pais pa) {
		this.pa = pa;
	} 
	
	
}
