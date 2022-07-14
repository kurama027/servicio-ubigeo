package com.formacionbdi.spring.app.ubigeo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax_poblacion")
public class poblacion {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_POBLACION")
	private long ID_POBLACION; 
	@Column(name = "ID_PROYECTO")
	private long ID_PROYECTO; 
	@Column(name = "NU_HABITANTES")
	private String NU_HABITANTES;
	public long getID_POBLACION() {
		return ID_POBLACION;
	}
	public void setID_POBLACION(long iD_POBLACION) {
		ID_POBLACION = iD_POBLACION;
	}
	public long getID_PROYECTO() {
		return ID_PROYECTO;
	}
	public void setID_PROYECTO(long iD_PROYECTO) {
		ID_PROYECTO = iD_PROYECTO;
	}
	public String getNU_HABITANTES() {
		return NU_HABITANTES;
	}
	public void setNU_HABITANTES(String nU_HABITANTES) {
		NU_HABITANTES = nU_HABITANTES;
	}  

}
